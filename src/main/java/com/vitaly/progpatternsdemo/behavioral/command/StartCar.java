package com.vitaly.progpatternsdemo.behavioral.command;

/*
09-Dec-23
gh /crazym8nd
*/
public class StartCar implements  Command {
    Car car;
    public StartCar(Car car){
        this.car = car;
    }
    public void execute(){
            car.startEngine();
    }
}
