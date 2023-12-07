package com.vitaly.progpatternsdemo.creational.builder;

/*
07-Dec-23
gh /crazym8nd
*/
public class FirstBuilderImpl extends Builder{
    public FirstBuilderImpl(){
        car = new Car();
    }
    public Car buildCar() {
        car.buildBase();
        car.buildWheels();
        Engine engine = new FirstEngine();
        car.buildEngine(engine);
        System.out.println("Машина с одним двигателем готова!");
        return car;
    }
}
