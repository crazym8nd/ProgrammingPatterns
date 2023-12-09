package com.vitaly.progpatternsdemo.structural.decorator;

/*
09-Dec-23
gh /crazym8nd
*/
public class DecoratorDemo {
    public static void main(String[] args) {
        Troll simpletroll = new SimpleTroll();
        simpletroll.attack();
        System.out.print("\n" + "Attack power is " + simpletroll.getAttackPower());

        System.out.println("\n");
        ClubbedTroll clubbedTroll = new ClubbedTroll(simpletroll);
        clubbedTroll.attack();
        System.out.println("\n" +"Attack power is over " + clubbedTroll.getAttackPower());
    }
}
