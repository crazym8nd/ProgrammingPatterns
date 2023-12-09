package com.vitaly.progpatternsdemo.structural.proxy;

/*
09-Dec-23
gh /crazym8nd
*/
public class IvoryTower implements WizardTower {
    public void enter(Wizard wizard) {
        System.out.println(wizard + " enters the tower");
    }
}
