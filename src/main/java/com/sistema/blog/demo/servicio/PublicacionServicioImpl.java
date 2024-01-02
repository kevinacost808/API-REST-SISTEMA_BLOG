package com.sistema.blog.demo.servicio;

import com.sistema.blog.demo.dto.PublicacionDto;
import com.sistema.blog.demo.entidades.Publicacion;
import com.sistema.blog.demo.repositorio.PublicacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicacionServicioImpl implements PublicacionServicio{

    @Autowired
    private PublicacionRepositorio publicacionRepositorio;
    @Override
    public PublicacionDto crearPublicacion(PublicacionDto publicacionDto) {
        //dto a entidad
        Publicacion publicacion = new Publicacion();
        publicacion.setTitulo(publicacionDto.getTitulo());
        publicacion.setDescripcion(publicacionDto.getDescripcion());
        publicacion.setContenido(publicacionDto.getContenido());

        Publicacion nuevaPublicacion = publicacionRepositorio.save(publicacion);

        //entidad a dto
        PublicacionDto publicacionRespuesta = new PublicacionDto();
        publicacionRespuesta.setId(nuevaPublicacion.getId());
        publicacionRespuesta.setTitulo(nuevaPublicacion.getTitulo());
        publicacionRespuesta.setDescripcion(nuevaPublicacion.getDescripcion());
        publicacionRespuesta.setContenido(nuevaPublicacion.getContenido());

        return publicacionRespuesta;
    }
}
