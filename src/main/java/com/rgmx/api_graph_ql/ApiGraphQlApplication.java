package com.rgmx.api_graph_ql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rgmx.api_graph_ql.data_base.autor;
import com.rgmx.api_graph_ql.data_base.libro;
import com.rgmx.api_graph_ql.data_base.repositorio_autor;
import com.rgmx.api_graph_ql.data_base.repositorio_libro;

@SpringBootApplication
public class ApiGraphQlApplication {
	@Autowired
	repositorio_autor repositorio_autor;
	@Autowired
	repositorio_libro repositorio_libro;
	public static void main(String[] args) {
		SpringApplication.run(ApiGraphQlApplication.class, args);
	}

	@Bean
	ApplicationRunner aRunner(repositorio_autor repo_autor,repositorio_libro repo_libro){
		return args ->{
			autor uno=new autor(1, "pepe loro");
			autor dos=new autor(2, "loro groso");
			repo_autor.save(uno);
			repo_autor.save(dos);
			repo_libro.save(new libro(1,"libro de pepe loro",uno));
			repo_libro.save(new libro(1,"libro de loro groso",dos));
			System.out.println("guardando info");
			System.out.println(repo_libro.findAll());
		};
	}
}
