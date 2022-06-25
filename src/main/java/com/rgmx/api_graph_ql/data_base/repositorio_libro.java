package com.rgmx.api_graph_ql.data_base;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorio_libro extends JpaRepository<libro,Integer>{
    Optional <libro> findByNombreLibro(String nombre);
}
