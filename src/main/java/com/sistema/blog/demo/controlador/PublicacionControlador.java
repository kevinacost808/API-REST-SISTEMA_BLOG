package com.sistema.blog.demo.controlador;

import com.sistema.blog.demo.servicio.PublicacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/publicaciones")
public class PublicacionControlador {
    @Autowired
    private PublicacionServicio publicacionServicio;
}
