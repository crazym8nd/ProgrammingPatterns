package com.vitaly.progpatternsdemo.behavioral.command;

/*
09-Dec-23
gh /crazym8nd
*/
public class StopCar implements Command {
    Car car;
    public StopCar(Car car){
        this.car = car;
    }
    public void execute(){
            car.stopEngine();
    }
}
