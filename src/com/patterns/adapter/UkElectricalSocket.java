package com.patterns.adapter;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class UkElectricalSocket {

    public void plugin(UkPlugConnector plugConnector) {
        plugConnector.provideElectricity();
    }
}
