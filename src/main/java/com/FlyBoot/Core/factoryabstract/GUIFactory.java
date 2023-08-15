package com.FlyBoot.Core.factoryabstract;

import com.FlyBoot.Core.factoryabstract.intarface.Button;
import com.FlyBoot.Core.factoryabstract.intarface.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
