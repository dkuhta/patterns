package com.patterns.facade;

/**
 * Created on 6/1/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class Main {

    public static void main(String[] args) {
        SystemFacade systemFacade = new SystemFacade();
        systemFacade.start();
    }
}
