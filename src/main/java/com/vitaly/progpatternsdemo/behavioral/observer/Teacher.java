package com.vitaly.progpatternsdemo.behavioral.observer;

/*
09-Dec-23
gh /crazym8nd
*/
public class Teacher implements WeatherObserver {
    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("Teacher sees that the weather is " + currentWeather.getDescription() );
    }
}
