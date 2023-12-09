package com.vitaly.progpatternsdemo.behavioral.state;

/*
09-Dec-23
gh /crazym8nd
*/
public class PeacefulState implements State {

    private final Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void observe() {
        System.out.println(mammoth + " is calm and peaceful.");
    }

    @Override
    public void onEnterState() {
        System.out.println(mammoth + " is peaceful.");
    }

}