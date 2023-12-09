package com.vitaly.progpatternsdemo.structural.proxy;

/*
09-Dec-23
gh /crazym8nd
*/
public class Wizard {

    private final String name;

    public Wizard (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}