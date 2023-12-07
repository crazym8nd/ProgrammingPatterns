package com.vitaly.progpatternsdemo.creational.abstractfactory;

/*
07-Dec-23
gh /crazym8nd
*/
public class ArcherHero extends Hero {
    public ArcherHero(String klass){
        super(klass);
    }
    @Override
    public void describe() {
        System.out.println("Я лучник " + klass);
        System.out.println("Мое оружие " + heroType.getName());
    }
}
