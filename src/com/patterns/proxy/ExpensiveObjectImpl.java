package com.patterns.proxy;

/**
 * Created on 6/11/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class ExpensiveObjectImpl implements ExpensiveObject {

    public ExpensiveObjectImpl() {
        System.out.println("Heavy initialization...");
    }

    @Override
    public void process() {
        System.out.println("Process completed.");
    }
}
