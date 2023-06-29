package com.FlyBoot;

import com.FlyBoot.models.Thanos;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PooSpringApplication implements CommandLineRunner {

    @Bean //Se realiza IoC y se utiliza seguido en base a configuracion necesaria de dependencias
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Autowired
    ObjectMapper om;

    @Autowired
    private Thanos thanos;
    public static void main(String[] args) {
        SpringApplication.run(PooSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String json = om.writeValueAsString(thanos);
        System.out.println(json);
    }
}