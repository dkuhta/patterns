package com.patterns.structural.facade;

/**
 * Created on 6/1/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class SystemFacade {

    private Module1 module1;
    private Module2 module2;

    public SystemFacade() {
        this.module1 = new Module1();
        this.module2 = new Module2();
    }

    void start() {
        System.out.println("Start " + this.getClass().getSimpleName());
        module1.start();
        module2.start();
    }
}
