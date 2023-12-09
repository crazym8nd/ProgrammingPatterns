package com.vitaly.progpatternsdemo.behavioral.strategy;

/*
09-Dec-23
gh /crazym8nd
*/
public class SpellStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("I'm casting spell of disintegration and the dragon vaporizes!");
    }
}
