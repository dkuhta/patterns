package com.patterns.decorator;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class SportCar extends CarDecorator {

    public SportCar(final Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Assemble sport features.");
    }
}
