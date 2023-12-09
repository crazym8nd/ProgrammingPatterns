package com.vitaly.progpatternsdemo.structural.decorator;

/*
09-Dec-23
gh /crazym8nd
*/
public class SimpleTroll implements Troll{
    @Override
    public int getAttackPower() {
        return 10;
    }
    @Override
    public void attack() {
        System.out.print("Troll is attacking");
    }
}
