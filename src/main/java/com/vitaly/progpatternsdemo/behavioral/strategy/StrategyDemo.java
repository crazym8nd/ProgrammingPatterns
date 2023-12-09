package com.vitaly.progpatternsdemo.behavioral.strategy;

/*
09-Dec-23
gh /crazym8nd
*/
public class StrategyDemo {
    private static final String GREEN_DRAGON_SPOTTED = "Green dragon spotted ahead!";
    private static final String BLACK_DRAGON_LANDS = "Black dragon lands before you.";


    public static void main(String[] args) {
        // GoF Strategy pattern
        System.out.println(GREEN_DRAGON_SPOTTED);
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();
        System.out.println();

        System.out.println(BLACK_DRAGON_LANDS);
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

    }
}