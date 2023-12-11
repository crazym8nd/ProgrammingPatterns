package com.vitaly.progpatternsdemo.structural.facade;

/*
09-Dec-23
gh /crazym8nd
*/
public class FacadeDemo {

    public static void main(String[] args) {

        //упрощенный интерфейс для работы
        GoldmineFacade facade = new GoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();

    }
}
