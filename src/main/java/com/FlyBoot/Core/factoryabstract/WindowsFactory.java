package com.FlyBoot.Core.factoryabstract;

import com.FlyBoot.Core.factoryabstract.intarface.Button;
import com.FlyBoot.Core.factoryabstract.intarface.Checkbox;
import com.FlyBoot.Core.factoryabstract.product.Windoscheckbox;
import com.FlyBoot.Core.factoryabstract.product.WindowsButton;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new Windoscheckbox();
    }
}
