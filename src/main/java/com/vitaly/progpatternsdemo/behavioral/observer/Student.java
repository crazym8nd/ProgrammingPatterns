package com.vitaly.progpatternsdemo.behavioral.observer;

/*
09-Dec-23
gh /crazym8nd
*/
public class Student  implements WeatherObserver{
    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("Student sees that the weather is " + currentWeather.getDescription() );
    }
}
