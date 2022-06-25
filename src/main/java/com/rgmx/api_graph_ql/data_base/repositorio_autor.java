package com.rgmx.api_graph_ql.data_base;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorio_autor extends JpaRepository <autor,Integer> {
    Optional <autor> findByNombre(String nombre);
}
