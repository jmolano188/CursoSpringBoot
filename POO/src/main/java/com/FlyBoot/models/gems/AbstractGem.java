package com.FlyBoot.models.gems;

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

    @Override
    public String toString() {
        return "{ name='" + name + '\'' +
                ", color='" + color + '\'' +
                " }";
    }
}
