package com.vitaly.progpatternsdemo.behavioral.strategy;

/*
09-Dec-23
gh /crazym8nd
*/
public class MeleeStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("With my Greatsword I sever the dragon's head!");
    }
}
