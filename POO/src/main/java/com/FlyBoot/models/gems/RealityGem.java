package com.FlyBoot.models.gems;

import org.springframework.stereotype.Component;

@Component(value = "reality")
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
