package com.FlyBoot.Core.factoryabstract.product;

import com.FlyBoot.Core.factoryabstract.intarface.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("haz creado un windowsButton");
    }
}
