package com.patterns.creational.builder;

/**
 * Created on 2019-10-22.
 *
 * @author Denis Kuhta
 */
public class Demo {

    public static void main(String[] args) {
        User user = new User.Builder("firstName", "firstName")
                .age(10)
                .phone("12345678")
                .build();

        System.out.println(user);
    }
}
