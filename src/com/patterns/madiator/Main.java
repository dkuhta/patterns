package com.patterns.madiator;

/**
 * Created on 6/1/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class Main {

    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User user1 = new UserImpl("Boris", chatMediator);
        User user2 = new UserImpl("Anton", chatMediator);
        User user3 = new UserImpl("Alena", chatMediator);

        user1.send("Hello world!");
    }
}
