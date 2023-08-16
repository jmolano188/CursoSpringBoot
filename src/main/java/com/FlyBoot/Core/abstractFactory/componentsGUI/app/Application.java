package com.FlyBoot.Core.abstractFactory.componentsGUI.app;

import com.FlyBoot.Core.abstractFactory.componentsGUI.buttons.Button;
import com.FlyBoot.Core.abstractFactory.componentsGUI.checkboxes.Checkbox;
import com.FlyBoot.Core.abstractFactory.componentsGUI.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
