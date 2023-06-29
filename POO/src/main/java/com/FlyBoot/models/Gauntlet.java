package com.FlyBoot.models;

import com.FlyBoot.models.gems.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Gauntlet {
    @Qualifier(value = "mind")
    private AbstractGem mind;
    @Qualifier(value = "soul")
    private AbstractGem soul;
    @Qualifier(value = "time")
    private AbstractGem time;
    @Qualifier(value = "space")
    private AbstractGem space;
    @Qualifier(value = "power")
    private AbstractGem power;
    @Qualifier(value = "reality")
    private AbstractGem reality;

    /*
    Inyeccion via constructor
     */
    @Autowired //Nuevas versiones no es necesario esta anotacion en el tipo constructor pero es una buena practica
    public Gauntlet(AbstractGem mind, AbstractGem soul, AbstractGem time, AbstractGem space, AbstractGem power, AbstractGem reality) {
        this.mind = mind;
        this.soul = soul;
        this.time = time;
        this.space = space;
        this.power = power;
        this.reality = reality;
    }

    @Override
    public String toString() {
        return "{ mind=" + mind.toString() +
                ", soul=" + soul +
                ", time=" + time +
                ", space=" + space +
                ", power=" + power +
                ", reality=" + reality +
                " }";
    }
}
