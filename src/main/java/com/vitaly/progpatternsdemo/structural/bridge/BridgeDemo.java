package com.vitaly.progpatternsdemo.structural.bridge;

/*
09-Dec-23
gh /crazym8nd
*/
public class BridgeDemo {
    public static void main(String[] args) {
        Device tv = new Tv();
        Remote remote = new BasicRemote(tv);

        tv.printStatus();
        remote.volumeDown();
        remote.volumeDown();

        tv.printStatus();

    }
}
