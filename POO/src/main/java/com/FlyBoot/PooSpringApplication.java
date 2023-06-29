package com.FlyBoot;

import com.FlyBoot.models.Thanos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PooSpringApplication implements CommandLineRunner {

    @Autowired
    private Thanos thanos;
    public static void main(String[] args) {
        SpringApplication.run(PooSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(thanos.toString());
    }
}