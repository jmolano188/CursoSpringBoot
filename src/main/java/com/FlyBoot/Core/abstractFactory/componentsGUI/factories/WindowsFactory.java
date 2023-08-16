package com.FlyBoot.Core.abstractFactory.componentsGUI.factories;

import com.FlyBoot.Core.abstractFactory.componentsGUI.buttons.Button;
import com.FlyBoot.Core.abstractFactory.componentsGUI.buttons.MacOSButton;
import com.FlyBoot.Core.abstractFactory.componentsGUI.buttons.WindowsButton;
import com.FlyBoot.Core.abstractFactory.componentsGUI.checkboxes.Checkbox;
import com.FlyBoot.Core.abstractFactory.componentsGUI.checkboxes.MacOSCheckbox;
import com.FlyBoot.Core.abstractFactory.componentsGUI.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
