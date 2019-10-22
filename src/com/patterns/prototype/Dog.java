package com.patterns.prototype;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class Dog implements Prototype {

    private String name;

    public Dog(final String field) {
        this.name = field;
    }

    public String getName() {
        return name;
    }

    @Override
    public Dog clone() throws CloneNotSupportedException {
        return new Dog(name);
    }
}
