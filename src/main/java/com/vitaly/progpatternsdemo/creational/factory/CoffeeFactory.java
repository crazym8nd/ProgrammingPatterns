package com.vitaly.progpatternsdemo.creational.factory;

/*
принимает какой тип создавать и создаем новый объект
gh /crazym8nd
*/
public class CoffeeFactory {
    public Coffee createCoffee (CoffeeType type){
        Coffee coffee = null;
        switch (type){
            case AMERICANO:
                coffee = new Americano();
                break;
            case CAPPUCCINO:
                coffee = new Cappuccino();
                break;
            default:
                throw new IllegalArgumentException("NO SUCH COFFEE SORRY: " + type);
        }
        return coffee;
    }
}
