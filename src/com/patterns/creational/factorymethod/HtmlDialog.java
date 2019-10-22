package com.patterns.creational.factorymethod;

/**
 * Created on 2019-10-22.
 *
 * @author Denis Kuhta
 * <p>
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
