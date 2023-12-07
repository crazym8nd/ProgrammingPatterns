package com.vitaly.progpatternsdemo.creational.builder;

/*
07-Dec-23
gh /crazym8nd
*/
public class Car {
    public void buildBase() {
        System.out.println("Делаем корпус");
    }
    public void buildWheels() {
        System.out.println("Ставим колесa");
    }

    public void buildNitro() {
        System.out.println("Ставим нитро!");
    }
    public void buildEngine(Engine engine) {
        System.out.println("Ставим движок: " + engine.getEngineType());
    }
    private void print(String msg){
        System.out.println(msg);
    }
}
