package com.patterns.observer;

/**
 * Created on 6/1/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class Main {

    public static void main(String[] args) {
        //Relationship one to many, notify all subscribed observers

        Channel1 channel1 = new Channel1();
        Channel2 channel2 = new Channel2();
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addObserver(channel1);
        newsAgency.addObserver(channel2);

        newsAgency.notify("AAAAAAAAA");
    }
}
