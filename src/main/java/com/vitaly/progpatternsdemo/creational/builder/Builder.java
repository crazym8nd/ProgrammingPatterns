package com.vitaly.progpatternsdemo.creational.builder;

/*
07-Dec-23
gh /crazym8nd
*/
abstract class Builder {
    protected Car car;
    public abstract Car buildCar();
}
