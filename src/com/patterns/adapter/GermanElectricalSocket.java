package com.patterns.adapter;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class GermanElectricalSocket {

    public void plugin(GermanPlugConnector plugConnector) {
        plugConnector.giveElectricity();
    }
}
