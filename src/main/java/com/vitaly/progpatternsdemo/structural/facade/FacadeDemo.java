package com.vitaly.progpatternsdemo.structural.facade;

/*
09-Dec-23
gh /crazym8nd
*/
public class FacadeDemo {

    public static void main(String[] args) {
        GoldmineFacade facade = new GoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();

    }
}
