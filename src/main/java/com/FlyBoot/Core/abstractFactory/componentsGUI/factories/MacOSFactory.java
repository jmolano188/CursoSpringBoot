package com.FlyBoot.Core.abstractFactory.componentsGUI.factories;

import com.FlyBoot.Core.abstractFactory.componentsGUI.buttons.Button;
import com.FlyBoot.Core.abstractFactory.componentsGUI.buttons.MacOSButton;
import com.FlyBoot.Core.abstractFactory.componentsGUI.checkboxes.Checkbox;
import com.FlyBoot.Core.abstractFactory.componentsGUI.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
