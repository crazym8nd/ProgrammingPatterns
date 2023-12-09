package com.vitaly.progpatternsdemo.structural.facade;

/*
09-Dec-23
gh /crazym8nd
*/
public class DwarvenTunnelDigger extends DwarvenMineWorker{

    @Override
    public void work() {
        System.out.println(name() +" digs a tunnel.");
    }

    @Override
    public String name() {
        return "Dwarven tunnel digger";
    }
}