package com.FlyBoot.models.gems;

import org.springframework.stereotype.Component;

@Component(value = "time")
public class TimeGem extends AbstractGem{

    public String description = "This is time gem";

    public TimeGem() {
        super("time", "green");
    }

    @Override
    public void showDescription() {
        System.out.println(description);
    }
}
