package com.FlyBoot.Core.factoryabstract.product;

import com.FlyBoot.Core.factoryabstract.intarface.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("haz creado un checbox en mac");
    }
}
