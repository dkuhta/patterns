package com.patterns.structural.bridge;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class Green implements Color {

    @Override
    public void applyColor() {
        System.out.println("Green color has been applied.");
    }
}
