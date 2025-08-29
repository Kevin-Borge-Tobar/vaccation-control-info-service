package com.borge.vcis.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class HttpRequestResponseInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("=== Solicitud entrante ===");
        System.out.println("URI: " + request.getRequestURI());
        System.out.println("Método: " + request.getMethod());
        System.out.println("Encabezados: " + request.getHeaderNames());
        System.out.println("Parámetros: " + request.getParameterMap());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("=== Respuesta saliente ===");
        System.out.println("Estado: " + response.getStatus());
        System.out.println("Encabezados: " + response.getHeaderNames());
    }
}