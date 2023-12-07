package com.vitaly.progpatternsdemo.creational.abstractfactory;

/*
07-Dec-23
gh /crazym8nd
*/
public abstract class HeroType {
    private String name;
    public HeroType(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
