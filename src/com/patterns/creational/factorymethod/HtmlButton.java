package com.patterns.creational.factorymethod;

/**
 * Created on 2019-10-22.
 *
 * @author Denis Kuhta
 * <p>
 * HTML button implementation.
 */
public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
