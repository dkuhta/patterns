package com.patterns.creational.factorymethod;

/**
 * Created on 2019-10-22.
 *
 * @author Denis Kuhta
 *
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    protected abstract Button createButton();
}
