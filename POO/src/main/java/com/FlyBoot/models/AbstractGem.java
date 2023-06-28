package com.FlyBoot.models;

public abstract class AbstractGem {

    private String name;
    private String color;

    protected AbstractGem(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //Metodo abstracto osea que no se define una implementacion
    public abstract void showDescription();

    public void showInfo(){
        System.out.println("Name: "+ this.name + " -- Color: "+ this.color);
    };
}
