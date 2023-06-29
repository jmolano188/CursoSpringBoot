package com.FlyBoot;

import com.FlyBoot.models.Gauntlet;
import com.FlyBoot.models.Thanos;
import com.FlyBoot.models.gems.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PooSpringApplication implements CommandLineRunner {

    @Autowired
    private Thanos thanos;
    public static void main(String[] args) {

        SpringApplication.run(PooSpringApplication.class, args);

        /* //CLASE PASADA InyDep sin IoC
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
        */
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(thanos.toString());
    }
}