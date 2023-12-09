package com.vitaly.progpatternsdemo.creational.abstractfactory;

/*
07-Dec-23
gh /crazym8nd
*/
public abstract class HeroType {
    private final String name;
    protected HeroType(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
