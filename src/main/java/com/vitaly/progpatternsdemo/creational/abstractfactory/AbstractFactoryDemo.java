package com.vitaly.progpatternsdemo.creational.abstractfactory;

/*
07-Dec-23
gh /crazym8nd
*/
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Garrison garrison;


        garrison = new SwordsmanGarrison();
        garrison.create(new SwordsmanHeroFactory(), "Олег").describe();

        garrison = new ArcherGarrison();
        garrison.create(new ArcherHeroFactory(), "Вячеслав").describe();
    }
}
