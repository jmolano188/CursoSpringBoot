package com.FlyBoot;

import com.FlyBoot.models.Gauntlet;
import com.FlyBoot.models.Thanos;
import com.FlyBoot.models.gems.*;

public class Main {
    public static void main(String[] args) {

        AbstractGem timeGem = new TimeGem();
        AbstractGem soulGem = new SoulGem();
        AbstractGem spaceGem = new SpaceGem();
        AbstractGem realityGem = new RealityGem();
        AbstractGem powerGem = new PowerGem();
        AbstractGem mindGem = new MindGem();

        Gauntlet gauntlet = new Gauntlet(mindGem,soulGem,timeGem,spaceGem,powerGem,realityGem);

        Thanos thanos = new Thanos();
        thanos.setGauntlet(gauntlet);

        System.out.println(thanos);
    }
}