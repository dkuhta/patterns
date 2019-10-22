package com.patterns.structural.decorator;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class CarDecorator implements Car {

    private Car car;

    public CarDecorator(final Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
    }
}
