package com.patterns.structural.decorator;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class Main {

    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        basicCar.assemble();

        Car sportCar = new SportCar(new BasicCar());
        sportCar.assemble();
    }
}
