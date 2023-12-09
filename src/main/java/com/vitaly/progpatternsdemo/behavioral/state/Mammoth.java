package com.vitaly.progpatternsdemo.behavioral.state;

/*
09-Dec-23
gh /crazym8nd
*/
public class Mammoth {
    private State state;

    public Mammoth() {
        state = new PeacefulState(this);
    }
    public void timePasses() {
        if (state.getClass().equals(PeacefulState.class)) {
            changeStateTo(new AngryState(this));
        } else {
            changeStateTo(new PeacefulState(this));
        }
    }

    private void changeStateTo(State newState) {
        this.state = newState;
        this.state.onEnterState();
    }

    @Override
    public String toString() {
        return "The mammoth";
    }

    public void observe() {
        this.state.observe();
    }
}