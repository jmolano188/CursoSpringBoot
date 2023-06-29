package com.FlyBoot.models.gems;

public class RealityGem extends AbstractGem{

    public String description = "This is reality gem";

    public RealityGem() {
        super("reality", "red");
    }

    @Override
    public void showDescription() {
        System.out.println(description);
    }
}
