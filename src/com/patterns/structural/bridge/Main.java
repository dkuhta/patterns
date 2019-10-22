package com.patterns.structural.bridge;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class Main {

    public static void main(String[] args) {
        Shape circleRed = new Circle(new Red());
        circleRed.applyColor();

        Shape greenCircle = new Circle(new Green());
        greenCircle.applyColor();
    }
}
