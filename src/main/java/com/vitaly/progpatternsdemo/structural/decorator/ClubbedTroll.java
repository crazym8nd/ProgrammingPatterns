package com.vitaly.progpatternsdemo.structural.decorator;

/*
09-Dec-23
gh /crazym8nd
*/
public class ClubbedTroll implements Troll{
    private final Troll clubbedtroll;
    public ClubbedTroll(Troll clubbedtroll){
    this.clubbedtroll = clubbedtroll;
    }

    @Override
    public int getAttackPower() {
        return clubbedtroll.getAttackPower() + 9000;
    }

    @Override
    public void attack() {
        clubbedtroll.attack();
        System.out.print(" with BIG CLUB!");
    }
}
