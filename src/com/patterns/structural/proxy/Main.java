package com.patterns.structural.proxy;

/**
 * Created on 6/11/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class Main {

    public static void main(String[] args) {
        ExpensiveObject proxy = new ExpensiveObjectProxy();
        proxy.process();
        proxy.process();
    }
}
