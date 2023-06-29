package com.FlyBoot.models;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component @Getter
public class Thanos {

    @Value("Thanos")
    private String name;
    @Value("${zaga}")
    private String zaga;
    @Value("${thanos.age}")
    private Integer age;

    /*
    Inyeccion via propiedad
     */
    @Autowired
    private Gauntlet gauntlet;


    @Override
    public String toString() {
        return "Thanos{" +
                "name='" + name + '\'' +
                ", zaga='" + zaga + '\'' +
                ", gauntlet=" + gauntlet +
                '}';
    }
}
