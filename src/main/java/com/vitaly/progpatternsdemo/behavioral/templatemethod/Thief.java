package com.vitaly.progpatternsdemo.behavioral.templatemethod;

/*
09-Dec-23
gh /crazym8nd
*/
public class Thief {
    private StealingMethod method;

    public Thief(StealingMethod method) {
        this.method = method;
    }

    public void steal() {
        method.steal();
    }

    public void changeMethod(StealingMethod method) {
        this.method = method;
    }
}