package com.FlyBoot.models.gems;

public class PowerGem extends AbstractGem{

    public String description = "This is power gem";

    public PowerGem() {
        super("power", "purple");
    }

    @Override
    public void showDescription() {
        System.out.println(description);
    }
}
