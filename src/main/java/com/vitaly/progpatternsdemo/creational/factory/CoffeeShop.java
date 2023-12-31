package com.vitaly.progpatternsdemo.creational.factory;

/*
07-Dec-23
gh /crazym8nd
*/
public class CoffeeShop {
    private CoffeeFactory coffeeFactory;
    public CoffeeShop(CoffeeFactory coffeeFactory){
        this.coffeeFactory = coffeeFactory;
    }
    public Coffee orderCoffee(CoffeeType type){
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.makeCoffee();
        coffee.grindCoffee();
        coffee.takeCoffee();
        System.out.println("Your "+ coffee+" is ready!");
        return coffee;
    }

}
