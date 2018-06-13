package com.patterns.observer;

import java.util.Observable;

/**
 * Created on 6/1/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class NewsAgency extends Observable {

    public void notify(final String news) {
        setChanged();
        notifyObservers(news);
    }
}
