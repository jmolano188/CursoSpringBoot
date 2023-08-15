package com.FlyBoot.Core.factoryabstract.product;

import com.FlyBoot.Core.factoryabstract.intarface.Button;

public class MacosButton implements Button {
    @Override
    public void paint() {
        System.out.println(" has creado un MacButton");
    }
}
