package com.FlyBoot.Core.factoryMethod.buttons.factory;

import com.FlyBoot.Core.factoryMethod.buttons.interfaces.Button;
import com.FlyBoot.Core.factoryMethod.buttons.products.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
