package com.FlyBoot;

import com.FlyBoot.models.*;

public class Main {
    public static void main(String[] args) {

        AbstractGem gem = new TimeGem();
        gem.showDescription();
        gem.showInfo();
    }
}