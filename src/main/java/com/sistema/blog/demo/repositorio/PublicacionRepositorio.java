package com.sistema.blog.demo.repositorio;

import com.sistema.blog.demo.entidades.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicacionRepositorio extends JpaRepository<Publicacion, Long> {
}
