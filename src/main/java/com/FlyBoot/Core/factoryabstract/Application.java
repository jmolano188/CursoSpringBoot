package com.FlyBoot.Core.factoryabstract;

import com.FlyBoot.Core.factoryabstract.intarface.Button;
import com.FlyBoot.Core.factoryabstract.intarface.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
