package com.patterns.creational.prototype;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog = new Dog("Vasya");
        Dog prototype = dog.clone();
        System.out.println(dog == prototype);
        System.out.println(dog.getName().endsWith(prototype.getName()));
    }
}
