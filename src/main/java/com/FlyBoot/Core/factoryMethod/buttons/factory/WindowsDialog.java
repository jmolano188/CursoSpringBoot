package com.FlyBoot.Core.factoryMethod.buttons.factory;

import com.FlyBoot.Core.factoryMethod.buttons.interfaces.Button;
import com.FlyBoot.Core.factoryMethod.buttons.products.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
