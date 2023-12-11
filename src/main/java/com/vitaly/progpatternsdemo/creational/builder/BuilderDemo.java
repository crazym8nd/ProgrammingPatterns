package com.vitaly.progpatternsdemo.creational.builder;

/*
мы сделали кострукторы
при передаче разных параметров используются разные имплементации
нам не важно что там куда как,мы знаем какой параметр приведет к нужной реализации
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
