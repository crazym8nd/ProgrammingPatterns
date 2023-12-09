package com.vitaly.progpatternsdemo.structural.bridge;

/*
09-Dec-23
gh /crazym8nd
*/
public interface Device {
    int getVolume();
    void setVolume(int volume);
    void printStatus();
}