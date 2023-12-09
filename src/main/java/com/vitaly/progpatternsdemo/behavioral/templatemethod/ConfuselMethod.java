package com.vitaly.progpatternsdemo.behavioral.templatemethod;

/*
09-Dec-23
gh /crazym8nd
*/
public class ConfuselMethod extends StealingMethod{
    @Override
    protected String pickTarget() {
        return "shop keeper";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println("Approach the " + target + " with tears running and hug him!");
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println("Grab the " + target + "'s wallet!");
    }
}
