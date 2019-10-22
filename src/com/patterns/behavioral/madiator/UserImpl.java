package com.patterns.behavioral.madiator;

/**
 * Created on 6/1/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class UserImpl extends User {

    public UserImpl(final String name, final ChatMediator chatMediator) {
        super(name, chatMediator);
        chatMediator.addUser(this);
    }

    @Override
    void send(final String msg) {
        chatMediator.sendMessage(this, name + " send message: " + msg);
    }

    @Override
    void receive(final String msg) {
        System.out.println(name + " receive msg: " + msg);
    }
}
