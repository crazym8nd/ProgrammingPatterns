package com.vitaly.progpatternsdemo.structural.facade;

import java.util.Arrays;

/*
09-Dec-23
gh /crazym8nd
*/
public abstract class DwarvenMineWorker {
    public void goToSleep(){
        System.out.println(name() + " going to sleep");
    }
    public void wakeUp(){
        System.out.println(name() + " wakes up");
    }
    public void goHome(){
        System.out.println(name() + " going home");
    }
    public void goToMine(){
        System.out.println(name() + " going to mine");
    }

    public void action(Action action){
        switch (action) {
            case GO_TO_SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_HOME:
                goHome();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            case WORK:
                work();
                break;
            default:
                System.out.println("Unsupported action");
        }
    }
    public void action(Action... actions) {
        Arrays.stream(actions).forEach(this::action);
    }
    public abstract void work();

    public abstract String name();
    enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }
}
