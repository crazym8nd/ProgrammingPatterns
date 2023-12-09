package com.vitaly.progpatternsdemo.structural.flyweight;

/*
09-Dec-23
gh /crazym8nd
*/
public class InvisibilityPotion implements Potion {
    @Override
    public void drink(){
        System.out.println("I'm invisible");
    }
}
