package com.vitaly.progpatternsdemo.behavioral.templatemethod;

/*
09-Dec-23
gh /crazym8nd
*/
public class HitAndRunMethod extends StealingMethod{

    @Override
    protected String pickTarget() {
        return "old goblin woman";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println("Approach the " + target + " from behind.");
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println( " Grab the " + target + "'s wallet and run away FAST!");
    }
}