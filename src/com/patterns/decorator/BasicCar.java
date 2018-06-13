package com.patterns.decorator;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Assemble basic car.");
    }
}
