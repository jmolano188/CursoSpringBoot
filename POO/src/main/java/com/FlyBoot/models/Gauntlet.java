package com.FlyBoot.models;

import com.FlyBoot.models.gems.AbstractGem;

public class Gauntlet {
    private AbstractGem mind;
    private AbstractGem soul;
    private AbstractGem time;
    private AbstractGem space;
    private AbstractGem power;
    private AbstractGem reality;

    /*
    Inyeccion de dependencias via constructor
     */
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
