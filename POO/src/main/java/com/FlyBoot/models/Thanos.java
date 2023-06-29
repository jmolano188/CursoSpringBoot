package com.FlyBoot.models;

public class Thanos {

    private String name = "Thanos";
    private String zaga = "Infinity war";
    private Gauntlet gauntlet;

    /*
    Inyenccion de dependencia via setter
     */
    public void setGauntlet(Gauntlet gauntlet) {
        this.gauntlet = gauntlet;
    }

    @Override
    public String toString() {
        return "Thanos{" +
                "name='" + name + '\'' +
                ", zaga='" + zaga + '\'' +
                ", gauntlet=" + gauntlet.toString() +
                '}';
    }
}
