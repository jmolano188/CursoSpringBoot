package com.FlyBoot.models;

import com.FlyBoot.models.gems.AbstractGem;
import com.FlyBoot.models.gems.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gauntlet {
    private MindGem mind;
    private SoulGem soul;
    private TimeGem time;
    private SpaceGem space;
    private PowerGem power;
    private RealityGem reality;

    /*
    Inyeccion via constructor
     */
    @Autowired //Nuevas versiones no es necesario esta anotacion en el tipo constructor pero es una buena practica
    public Gauntlet(MindGem mind, SoulGem soul, TimeGem time, SpaceGem space, PowerGem power, RealityGem reality) {
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
