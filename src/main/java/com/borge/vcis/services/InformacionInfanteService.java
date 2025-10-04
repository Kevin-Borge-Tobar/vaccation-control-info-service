package com.borge.vcis.services;

import com.borge.vcis.dtos.InformacionInfanteDto;
import com.borge.vcis.dtos.mapped.InformacionGeneralInfanteDto;
import com.borge.vcis.entities.Contacto;
import com.borge.vcis.entities.Domicilio;
import com.borge.vcis.entities.InformacionInfante;
import com.borge.vcis.entities.Responsable;
import com.borge.vcis.repositories.*;
import com.borge.vcis.utils.GenericMapper;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service
public class InformacionInfanteService extends GenericServiceImpl<InformacionInfanteDto, InformacionInfante, Long> {
    private final InformacionInfanteRepository informacionInfanteRepository;
    private final DomicilioRepository domicilioRepository;
    private final ContactoRepository contactoRepository;
    private final ResponsableRepository responsableRepository;
    private final SedeRepository sedeRepository;
    private final GeneroRepository generoRepository;
    private final GenericMapper mapper;
    private final TipoContactoRepository tipoContactoRepository;
    private final TipoResponsableRepository tipoResponsableRepository;
    private final InformacionCentroRepository informacionCentroRepository;

    public InformacionInfanteService(InformacionInfanteRepository repository, DomicilioRepository domicilioRepository, ContactoRepository contactoRepository, ResponsableRepository responsableRepository, SedeRepository sedeRepository, GeneroRepository generoRepository, GenericMapper mapper, TipoContactoRepository tipoContactoRepository, TipoResponsableRepository tipoResponsableRepository, InformacionCentroRepository informacionCentroRepository) {
        super(repository, mapper, InformacionInfanteDto.class, InformacionInfante.class);
        this.informacionInfanteRepository = repository;
        this.domicilioRepository = domicilioRepository;
        this.contactoRepository = contactoRepository;
        this.responsableRepository = responsableRepository;
        this.sedeRepository = sedeRepository;
        this.generoRepository = generoRepository;

        this.mapper = mapper;
        this.tipoContactoRepository = tipoContactoRepository;
        this.tipoResponsableRepository = tipoResponsableRepository;
        this.informacionCentroRepository = informacionCentroRepository;
    }

    public List<InformacionInfanteDto> obtenerInfantePorCui(String cui) {
        List<InformacionInfante> infantes = informacionInfanteRepository.findByCui(cui);
        return mapper.toDtoList(infantes, InformacionInfanteDto.class);
    }


    @Transactional
    public InformacionGeneralInfanteDto guardarDatosGenerales(InformacionGeneralInfanteDto dto) {
        log.info("Guardando datos generales del infante:");
        log.info(dto.toString());
        final boolean creating = dto.getId() == null;
        InformacionInfante entity = new InformacionInfante();

        if (creating) {
            log.info("Creando nuevo infante...");
            InformacionInfante newEntity = new InformacionInfante();
            newEntity.setCui(dto.getCui());
            newEntity.setNombres(dto.getNombres());
            newEntity.setApellidos(dto.getApellidos());
            newEntity.setFechaNacimiento(dto.getFechaNacimiento());
            newEntity.setFechaRegistro(LocalDate.now());
            newEntity.setDescripcion(dto.getDescripcion());
            newEntity.setSede(sedeRepository.findById(dto.getSede().getId()).orElse(null));
            newEntity.setGenero(generoRepository.findById(dto.getGenero().getId()).orElse(null));
            entity = informacionInfanteRepository.save(newEntity);

        } else {
            log.info("Actualizando infante existente con ID: " + dto.getId());
            entity = informacionInfanteRepository.findById(dto.getId().longValue())
                    .orElseThrow(() -> new IllegalArgumentException("Infante no encontrado: " + dto.getId()));
            entity.setCui(dto.getCui());
            entity.setNombres(dto.getNombres());
            entity.setApellidos(dto.getApellidos());
            entity.setFechaNacimiento(dto.getFechaNacimiento());
            entity.setFechaRegistro(dto.getFechaRegistro());
            entity.setDescripcion(dto.getDescripcion());

//            informacionInfanteRepository.save(entity);
            log.info("Actualizado infante con CUI: ");
            log.info(entity.getCui().toString());
        }

        if (dto.getSede() != null && dto.getSede().getId() != null) {
            entity.setSede(sedeRepository.getReferenceById(dto.getSede().getId()));
            log.info("sede seteada: " + entity.getSede().getName());
        }
        if (dto.getGenero() != null && dto.getGenero().getId() != null) {
            entity.setGenero(generoRepository.getReferenceById(dto.getGenero().getId()));
            log.info("genero seteado: " + entity.getGenero().getDescripcion());
        }

        if (entity.getContactos() == null)    entity.setContactos(new ArrayList<>());
        if (entity.getResponsables() == null) entity.setResponsables(new ArrayList<>());
        if (entity.getDomicilios() == null)   entity.setDomicilios(new ArrayList<>());


        log.info("Creando contactos...");
        if (creating && !entity.getContactos().isEmpty()) {
            for (Contacto c : entity.getContactos()) {
                c.setInformacionInfante(entity);
                if (c.getTipoContacto() != null && c.getTipoContacto().getId() != null) {
                    c.setTipoContacto(tipoContactoRepository.getReferenceById(c.getTipoContacto().getId()));
                }
            }
        } else if (dto.getContactos() != null) {
            log.info("Actualizando contactos...");
            Map<Integer, Contacto> existentes = entity.getContactos().stream()
                    .filter(c -> c.getId() != null)
                    .collect(Collectors.toMap(Contacto::getId, c -> c));

            List<Contacto> nuevaLista = new ArrayList<>();
            for (var cDto : dto.getContactos()) {
                Contacto target = (cDto.getId() != null) ? existentes.get(cDto.getId()) : null;
                if (target == null) {
                    target = new Contacto();
                    target.setInformacionInfante(entity);
                }
                target.setNumero(cDto.getNumero());
                target.setDescripcion(cDto.getDescripcion());
                if (cDto.getTipoContacto() != null && cDto.getTipoContacto().getId() != null) {
                    target.setTipoContacto(tipoContactoRepository.getReferenceById(cDto.getTipoContacto().getId()));
                }
                nuevaLista.add(target);
            }
            entity.getContactos().clear();              // reemplazo controlado
            entity.getContactos().addAll(nuevaLista);
        }
        // Si dto.getContactos() == null en update -> mantiene los existentes

        // ================== DOMICILIOS ==================
        if (creating && !entity.getDomicilios().isEmpty()) {
            for (Domicilio d : entity.getDomicilios()) {
                d.setInformacionInfante(entity);
            }
        } else if (dto.getDomicilios() != null) { // <-- SOLO si el DTO trae la lista
            Map<Integer, Domicilio> domExistentes = entity.getDomicilios().stream()
                    .filter(d -> d.getId() != null)
                    .collect(Collectors.toMap(Domicilio::getId, d -> d));

            List<Domicilio> nuevaListaDom = new ArrayList<>();
            for (var dDto : dto.getDomicilios()) {
                Domicilio target = (dDto.getId() != null) ? domExistentes.get(dDto.getId()) : null;
                if (target == null) {
                    target = new Domicilio();
                    target.setInformacionInfante(entity);
                }
                target.setNumeroCasa(dDto.getNumeroCasa());
                target.setNumeroSector(dDto.getNumeroSector());
                target.setDireccion(dDto.getDireccion());
                target.setComuninidad(dDto.getComuninidad());
                nuevaListaDom.add(target);
            }
            entity.getDomicilios().clear();
            entity.getDomicilios().addAll(nuevaListaDom);
        }

        // ================== RESPONSABLES ==================
        if (creating && !entity.getResponsables().isEmpty()) {
            for (Responsable r : entity.getResponsables()) {
                r.setInformacionInfante(entity);
                if (r.getTipoResponsable() != null && r.getTipoResponsable().getId() != null) {
                    r.setTipoResponsable(tipoResponsableRepository.getReferenceById(r.getTipoResponsable().getId()));
                }
                if (r.getFechaRegistro() == null) { // default al crear
                    r.setFechaRegistro(LocalDate.now());
                }
            }
        } else if (dto.getResponsables() != null) { // <-- SOLO si el DTO trae la lista
            Map<Integer, Responsable> respExistentes = entity.getResponsables().stream()
                    .filter(r -> r.getId() != null)
                    .collect(Collectors.toMap(Responsable::getId, r -> r));

            List<Responsable> nuevaListaResp = new ArrayList<>();
            for (var rDto : dto.getResponsables()) {
                Responsable target = (rDto.getId() != null) ? respExistentes.get(rDto.getId()) : null;
                if (target == null) {
                    target = new Responsable();
                    target.setInformacionInfante(entity);
                    if (rDto.getFechaRegistro() == null) {
                        target.setFechaRegistro(LocalDate.now());
                    }
                }
                target.setCui(rDto.getCui());
                target.setNombreCompleto(rDto.getNombreCompleto());
                target.setResponsableCita(rDto.getResponsableCita());   // String en tu entidad
                if (rDto.getFechaRegistro() != null) {
                    target.setFechaRegistro(rDto.getFechaRegistro());
                }
                if (rDto.getTipoResponsable() != null && rDto.getTipoResponsable().getId() != null) {
                    target.setTipoResponsable(
                            tipoResponsableRepository.getReferenceById(rDto.getTipoResponsable().getId())
                    );
                }
                nuevaListaResp.add(target);
            }
            entity.getResponsables().clear();
            entity.getResponsables().addAll(nuevaListaResp);
        }

        InformacionInfante saved = informacionInfanteRepository.save(entity);
        InformacionGeneralInfanteDto result = new InformacionGeneralInfanteDto();
        result.setId(saved.getId().intValue());
        result.setCui(saved.getCui());
        result.setNombres(saved.getNombres());
        result.setApellidos(saved.getApellidos());
        result.setFechaNacimiento(saved.getFechaNacimiento());
        result.setFechaRegistro(saved.getFechaRegistro());
        result.setDescripcion(saved.getDescripcion());
        result.setSede(dto.getSede());
        result.setGenero(dto.getGenero());
        return  result;
    }

}
