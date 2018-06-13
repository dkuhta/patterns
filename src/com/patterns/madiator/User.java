package com.patterns.madiator;

import com.sun.corba.se.pept.protocol.MessageMediator;

/**
 * Created on 6/1/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public abstract class User {

    protected String name;
    protected ChatMediator chatMediator;

    public User(final String name, final ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    abstract void send(String msg);

    abstract void receive(String msg);
}
