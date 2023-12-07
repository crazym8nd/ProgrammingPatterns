package com.vitaly.progpatternsdemo.creational.builder;

/*
07-Dec-23
gh /crazym8nd
*/
public class BuilderDemo {
    public static void main(String[] args) {
        Build build = new Build(1);
        build.buildCar();

        System.out.println("------------------");
        Build build2 = new Build(2);
        build2.buildCar();
    }
}
