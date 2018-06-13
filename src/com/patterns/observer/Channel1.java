package com.patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created on 6/1/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class Channel1 implements Observer {

    @Override
    public void update(final Observable o, final Object arg) {
        System.out.println(this.getClass().getSimpleName() + " received: " + arg);
    }
}
