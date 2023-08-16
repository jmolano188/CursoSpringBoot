package com.FlyBoot.Core.abstractFactory.componentsGUI.factories;

import com.FlyBoot.Core.abstractFactory.componentsGUI.buttons.Button;
import com.FlyBoot.Core.abstractFactory.componentsGUI.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
