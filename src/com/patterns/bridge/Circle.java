package com.patterns.bridge;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class Circle extends Shape {

    public Circle(final Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        color.applyColor();
    }
}
