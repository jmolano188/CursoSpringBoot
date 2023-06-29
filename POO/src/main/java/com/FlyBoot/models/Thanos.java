package com.FlyBoot.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Thanos {

    private String name = "Thanos";
    private String zaga = "Infinity war";

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
                ", gauntlet=" + gauntlet.toString() +
                '}';
    }
}
