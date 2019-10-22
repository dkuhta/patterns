package com.patterns.creational.sinlgleton;

/**
 * Created on 2019-10-22.
 *
 * @author Denis Kuhta
 */
public enum EnumSingleton {

    INSTANCE;

    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public void doProcess() {
        System.out.println("Do high memory or CPU consume operation. count :-" + this.count);
    }

}
