package com.patterns.structural.adapter;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class GermanToUkPlugAdapter implements UkPlugConnector {

    private GermanPlugConnector plugConnector;

    public GermanToUkPlugAdapter(final GermanPlugConnector plugConnector) {
        this.plugConnector = plugConnector;
    }

    @Override
    public void provideElectricity() {
        plugConnector.giveElectricity();
    }
}
