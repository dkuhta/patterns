package com.patterns.behavioral.madiator;

/**
 * Created on 6/1/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public interface ChatMediator {

    void addUser(User user);

    void sendMessage(User u, String msg);
}
