package com.FlyBoot.Core.factoryabstract;

import com.FlyBoot.Core.factoryabstract.intarface.Button;
import com.FlyBoot.Core.factoryabstract.intarface.Checkbox;
import com.FlyBoot.Core.factoryabstract.product.MacCheckbox;
import com.FlyBoot.Core.factoryabstract.product.MacosButton;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacosButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
