package com.vitaly.progpatternsdemo.structural.facade;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
09-Dec-23
gh /crazym8nd
*/
public class GoldmineFacade {
    private final List<DwarvenMineWorker> workers;


    public GoldmineFacade(){
        workers = Arrays.asList(
                new DwarvenGoldDigger(),
                new DwarvenCartOperator(),
                new DwarvenTunnelDigger());
    }

    public void startNewDay(){
        makeActions(workers, DwarvenMineWorker.Action.WAKE_UP, DwarvenMineWorker.Action.GO_TO_MINE);
    }

    public void digOutGold() {
        makeActions(workers, DwarvenMineWorker.Action.WORK);
    }

    public void endDay() {
        makeActions(workers, DwarvenMineWorker.Action.GO_HOME, DwarvenMineWorker.Action.GO_TO_SLEEP);
    }

    private static void makeActions(
            Collection<DwarvenMineWorker> workers,
            DwarvenMineWorker.Action... actions
    ) {
        workers.forEach(worker -> worker.action(actions));
    }

}
