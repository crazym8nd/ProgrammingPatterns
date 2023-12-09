package com.vitaly.progpatternsdemo.structural.facade;

/*
09-Dec-23
gh /crazym8nd
*/
public class DwarvenGoldDigger extends DwarvenMineWorker{

    @Override
    public void work() {
        System.out.println(name() + " digs for gold.");
    }

    @Override
    public String name() {
        return "Dwarf gold digger";
    }
}