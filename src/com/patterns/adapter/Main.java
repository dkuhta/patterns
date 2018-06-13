package com.patterns.adapter;

/**
 * Created on 6/13/18.
 *
 * @author Denis Kuhta
 * @since JDK1.8
 */
public class Main {

    public static void main(String[] args) {
        //когда один интерфейс нужно адаптировать под другой
        UkPlugConnector plugConnector = new GermanToUkPlugAdapter(new GermanPlugConnector() {
            @Override
            public void giveElectricity() {
                System.out.println("German plugin connector has been connected to UK socket.");;
            }
        });

        plugConnector.provideElectricity();
    }
}
