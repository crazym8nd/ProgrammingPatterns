package com.vitaly.progpatternsdemo.creational.abstractfactory;

/*
07-Dec-23
gh /crazym8nd
*/
public class SwordsmanHero extends Hero {
    public SwordsmanHero(String klass) {
        super(klass);
    }

    @Override
    public void describe() {
        System.out.println("Я мечник " + klass);
        System.out.println("Мое оружие " + heroType.getName());
    }
}