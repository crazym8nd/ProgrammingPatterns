package com.vitaly.progpatternsdemo.behavioral.command;

/*
bridge бы ичпользовали, если у нас машины были разных типов
то есть car была бы абстракцией

*/
public class CommandDemo {
    public static void main(String[] args) {
        Car car = new Car();
        StartCar startCar = new StartCar(car); //команда в качестве класса
        StopCar stopCar = new StopCar(car); //команда в качестве класса
        CarInvoker carInvoker = new CarInvoker(startCar);
        carInvoker.execute();


        carInvoker.setCommand(stopCar);
        carInvoker.execute();
    }
}
