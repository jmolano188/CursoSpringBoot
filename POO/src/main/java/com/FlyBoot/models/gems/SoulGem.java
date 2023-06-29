package com.FlyBoot.models.gems;

public class SoulGem extends AbstractGem{

    public String description = "This is soul gem";

    public SoulGem() {
        super("soul", "orange");
    }

    @Override
    public void showDescription() {
        System.out.println(description);
    }
}
