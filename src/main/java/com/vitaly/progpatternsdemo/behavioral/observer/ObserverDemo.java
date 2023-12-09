package com.vitaly.progpatternsdemo.behavioral.observer;

/*
09-Dec-23
gh /crazym8nd
*/
public class ObserverDemo {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.addObserver(new Student());
        weather.addObserver(new Teacher());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
    }
}
