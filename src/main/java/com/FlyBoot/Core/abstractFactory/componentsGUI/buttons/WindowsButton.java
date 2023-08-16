package com.FlyBoot.Core.abstractFactory.componentsGUI.buttons;

import com.FlyBoot.Core.abstractFactory.componentsGUI.buttons.Button;

/**
 * All products families have the same varieties (MacOS/Windows).
 * <p>
 * This is another variant of a button.
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
