package com.vitaly.progpatternsdemo.structural.decorator;

/*
09-Dec-23
gh /crazym8nd
*/
public class ClubbedTroll implements Troll{
    private final Troll trollThatGetsAClub;
    public ClubbedTroll(Troll trollThatGetsAClub){
    this.trollThatGetsAClub = trollThatGetsAClub;
    }

    @Override
    public int getAttackPower() {
        return trollThatGetsAClub.getAttackPower() + 9000;
    }

    @Override
    public void attack() {
        trollThatGetsAClub.attack();
        System.out.print(" with BIG CLUB!");
    }
}
