package com.vitaly.progpatternsdemo.behavioral.visitor;

/*
09-Dec-23
gh /crazym8nd
*/
public class CommanderVisitor implements UnitVisitor {

    @Override
    public void visit(Soldier soldier) {
    }

    @Override
    public void visit(Commander commander) {
        System.out.println("Good to see you " + commander);
    }
}