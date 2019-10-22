package com.patterns.structural.proxy;

/**
 * Created on 6/11/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class ExpensiveObjectProxy implements ExpensiveObject {

    private ExpensiveObject expensiveObject;

    @Override
    public void process() {
        if (expensiveObject == null) {
            expensiveObject = new ExpensiveObjectImpl();
        }
        expensiveObject.process();
    }
}
