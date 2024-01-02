package com.sistema.blog.demo.controlador;

import com.sistema.blog.demo.dto.PublicacionDto;
import com.sistema.blog.demo.entidades.Publicacion;
import com.sistema.blog.demo.servicio.PublicacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/publicaciones")
public class PublicacionControlador {
    @Autowired
    private PublicacionServicio publicacionServicio;

    @PostMapping
    public ResponseEntity<PublicacionDto> guardarPublicacion(@RequestBody PublicacionDto publicacionDto){
        return new ResponseEntity<>(publicacionServicio.crearPublicacion(publicacionDto), HttpStatus.CREATED);
    }
}
