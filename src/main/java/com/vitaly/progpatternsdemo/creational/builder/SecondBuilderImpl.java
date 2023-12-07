package com.vitaly.progpatternsdemo.creational.builder;

/*
07-Dec-23
gh /crazym8nd
*/
public class SecondBuilderImpl extends Builder{
    public SecondBuilderImpl(){
        car = new Car();
    }
    public Car buildCar() {
        car.buildBase();
        car.buildWheels();
        Engine engine = new FirstEngine();
        car.buildEngine(engine);
        car.buildWheels();
        engine = new SecondEngine();
        car.buildEngine(engine);
        car.buildNitro();
        System.out.println("Машина с двумя двигателями готова!");
        return car;
    }
}