package com.vitaly.progpatternsdemo.behavioral.command;

/*
09-Dec-23
gh /crazym8nd
*/
public class CommandDemo {
    public static void main(String[] args) {
        Car car = new Car();
        StartCar startCar = new StartCar(car);
        StopCar stopCar = new StopCar(car);
        CarInvoker carInvoker = new CarInvoker(startCar);
        carInvoker.execute();


        carInvoker.setCommand(stopCar);
        carInvoker.execute();
    }
}
