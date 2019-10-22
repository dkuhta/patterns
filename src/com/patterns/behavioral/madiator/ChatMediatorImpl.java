package com.patterns.behavioral.madiator;

import java.util.HashSet;
import java.util.Set;

/**
 * Created on 6/1/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class ChatMediatorImpl implements ChatMediator {

    private Set<User> users = new HashSet<>();

    @Override
    public void addUser(final User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(final User user, final String msg) {
        users.forEach(u -> {
            if (u != user) {
                u.receive(msg);
            }
        });
    }
}
