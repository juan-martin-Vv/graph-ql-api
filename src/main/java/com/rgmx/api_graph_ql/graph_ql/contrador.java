package com.rgmx.api_graph_ql.graph_ql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.rgmx.api_graph_ql.data_base.autor;
import com.rgmx.api_graph_ql.data_base.libro;
import com.rgmx.api_graph_ql.data_base.repositorio_autor;
import com.rgmx.api_graph_ql.data_base.repositorio_libro;



@Controller
public class contrador {

    @Autowired
    repositorio_autor repo_autor;
    @Autowired
    repositorio_libro repo_libros;
    
    @QueryMapping
    Iterable<autor> authors(){
        return repo_autor.findAll();
    }
    @QueryMapping
    Iterable<libro> libros(){
        return repo_libros.findAll();
    }
}
