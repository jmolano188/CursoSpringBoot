package com.FlyBoot.models;

public class SpaceGem extends AbstractGem{

    public String description = "This is space gem";

    public SpaceGem() {
        super("space", "blue");
    }

    @Override
    public void showDescription() {
        System.out.println(description);
    }
}
