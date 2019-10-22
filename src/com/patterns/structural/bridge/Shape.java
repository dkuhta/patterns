package com.patterns.structural.bridge;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public abstract class Shape {

    protected Color color;

    public Shape(final Color color) {
        this.color = color;
    }

    abstract void applyColor();
}
