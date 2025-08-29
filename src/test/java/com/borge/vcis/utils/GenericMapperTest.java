package com.borge.vcis.utils;

import com.borge.vcis.dtos.InformacionInfanteDto;
import com.borge.vcis.entities.InformacionInfante;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericMapperTest {

    private GenericMapper genericMapper;

    @BeforeEach
    void setUp() {
        genericMapper = new GenericMapper();
    }

    @Test
    void testToEntity() {
        // Arrange
        InformacionInfanteDto dto = new InformacionInfanteDto(
                1,
                "1234567890123",
                "Juan",
                "Pérez",
                java.time.LocalDate.of(1990, 1, 15),
                java.time.LocalDate.of(2023, 10, 1),
                "Descripción de prueba",
                null,
                null
        );

        // Act
        InformacionInfante entity = genericMapper.toEntity(dto, InformacionInfante.class);

        // Assert
        assertEquals(dto.getId(), entity.getId());
        assertEquals(dto.getCui(), entity.getCui());
        assertEquals(dto.getNombres(), entity.getNombres());
        assertEquals(dto.getApellidos(), entity.getApellidos());
        assertEquals(dto.getFechaNacimiento(), entity.getFechaNacimiento());
        assertEquals(dto.getFechaRegistro(), entity.getFechaRegistro());
        assertEquals(dto.getDescripcion(), entity.getDescripcion());
    }
}