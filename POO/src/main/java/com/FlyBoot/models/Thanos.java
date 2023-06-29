package com.FlyBoot.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Thanos {

    public String name = "Thanos";
    public String zaga = "Infinity war";

    /*
    Inyeccion via propiedad
     */
    @Autowired
    public Gauntlet gauntlet;

    @Override
    public String toString() {
        return "Thanos{" +
                "name='" + name + '\'' +
                ", zaga='" + zaga + '\'' +
                ", gauntlet=" + gauntlet +
                '}';
    }
}
