package com.patterns.creational.factorymethod;

/**
 * Created on 2019-10-22.
 *
 * @author Denis Kuhta
 *
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
