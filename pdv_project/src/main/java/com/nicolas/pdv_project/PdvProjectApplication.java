package com.nicolas.pdv_project;

import com.nicolas.pdv_project.entities.TesteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PdvProjectApplication {

    public static void main(String[] args) {SpringApplication.run(PdvProjectApplication.class, args);}

    @Bean
    CommandLineRunner run(TesteRepository repository) {
        return args -> {
            System.out.println("Conectando database...");
            repository.findAll().forEach(registro -> {
                System.out.println("Dado encontrado: " + registro.getNome());
            });
            System.out.println("Database connect established succefully!");
        };
    }
}