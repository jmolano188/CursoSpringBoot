package com.FlyBoot.models.gems;

public class MindGem extends AbstractGem{

    public String description = "This is mind gem";

    public MindGem() {
        super("mind", "yellow");
    }

    @Override
    public void showDescription() {
        System.out.println(description);
    }


}
