package com.vitaly.progpatternsdemo.structural.facade;

/*
09-Dec-23
gh /crazym8nd
*/
public class DwarvenCartOperator extends DwarvenMineWorker{

    @Override
    public void work() {
        System.out.println(name() + " moves gold chunks out of the mine.");
    }

    @Override
    public String name() {
        return "Dwarf cart operator";
    }
}