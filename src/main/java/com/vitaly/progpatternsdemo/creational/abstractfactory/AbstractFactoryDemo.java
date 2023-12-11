package com.vitaly.progpatternsdemo.creational.abstractfactory;

/*
можем легк осоздать новый тип войск при необходимости
быть уверенными в соблюдении контрактов
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
