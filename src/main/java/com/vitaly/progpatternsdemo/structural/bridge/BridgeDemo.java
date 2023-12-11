package com.vitaly.progpatternsdemo.structural.bridge;

/*
09-Dec-23
gh /crazym8nd
*/
public class BridgeDemo {
    public static void main(String[] args) {
        Device tv = new Tv(); //базовые методы реализацией интервейса
        Remote remote = new BasicRemote(tv); // принимает обьект device в параметр конструктора
        // и использует этот обьект для вызова методов управления

        tv.printStatus();
        remote.volumeDown();
        remote.volumeDown();

        tv.printStatus();

    }
}
