package com.vitaly.progpatternsdemo.behavioral.visitor;

/*
09-Dec-23
gh /crazym8nd
*/
public class SoldierVisitor implements UnitVisitor {
    @Override
    public void visit(Soldier soldier) {
        System.out.println("Greetings " + soldier);
    }
    @Override
    public void visit(Commander commander) {
    }
}