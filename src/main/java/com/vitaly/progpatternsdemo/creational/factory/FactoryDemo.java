package com.vitaly.progpatternsdemo.creational.factory;

/*
07-Dec-23
gh /crazym8nd
*/
public class FactoryDemo {
    public static void main(String[] args) {
        //создаем фабрику и передаем ее в качестве параметра магазину
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeShop coffeeShop = new CoffeeShop(coffeeFactory);


        coffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
        coffeeShop.orderCoffee(CoffeeType.AMERICANO);
    }
}
