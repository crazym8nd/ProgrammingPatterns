package com.vitaly.progpatternsdemo.creational.abstractfactory;

/*
07-Dec-23
gh /crazym8nd
*/
public abstract class Hero {
    String klass;
    HeroType heroType;
    protected Hero(String klass){
        this.klass = klass;
    }
    public void setHeroType(HeroType heroType){
        this.heroType = heroType;
    }
    public abstract void describe();

}
