package com.vitaly.progpatternsdemo.creational.prototype;

/*
07-Dec-23
gh /crazym8nd
*/
public class PrototypeDemo {
    public static void main(String[] args) {
        Lama pinkPtototype = new PinkLama("Mr. Pink");
        Lama rainbowPrototype = new RainbowLama("Mr. Rainbow");

        Lama clonePinkLama = pinkPtototype.copy();
        Lama cloneRainbowLama = rainbowPrototype.copy();

        clonePinkLama.setName("Mr. Pink Clone");
        cloneRainbowLama.setName("Mr. Rainbow Clone");

        Lama cloneRandomLama;
        if (Math.random() > 0.5) {
            cloneRandomLama = pinkPtototype.copy();
            cloneRandomLama.setName("Mr. Random Pink Clone");
        } else {
            cloneRandomLama = rainbowPrototype.copy();
            cloneRandomLama.setName("Mr. Random Rainbow Clone");
        }

        System.out.println("PinkLama: " + clonePinkLama.getName());
        System.out.println("RainbowLama: " + cloneRainbowLama.getName());
        System.out.println("RamdomLama: " + cloneRandomLama.getName());

    }
}
