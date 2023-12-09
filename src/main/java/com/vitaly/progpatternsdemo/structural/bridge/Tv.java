package com.vitaly.progpatternsdemo.structural.bridge;

/*
09-Dec-23
gh /crazym8nd
*/
public class Tv implements Device{
    private int volume = 30;

    @Override
    public int getVolume() {
        return volume;
    }
    @Override
    public void setVolume(int volume) {
        this.volume = volume;

    }
    @Override
    public void printStatus() {
        System.out.println("| I'm TV.");
        System.out.println("| Current volume is " + volume + "%");
    }
}
