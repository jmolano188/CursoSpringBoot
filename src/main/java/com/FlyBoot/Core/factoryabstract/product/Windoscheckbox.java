package com.FlyBoot.Core.factoryabstract.product;

import com.FlyBoot.Core.factoryabstract.intarface.Checkbox;

public class Windoscheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("haz creado un checkbox desde windows");
    }
}
