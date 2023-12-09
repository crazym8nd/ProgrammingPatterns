package com.vitaly.progpatternsdemo.behavioral.visitor;

/*
09-Dec-23
gh /crazym8nd
*/
public class Commander extends Unit {

    public Commander(Unit... children) {
        super(children);
    }
    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visit(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "commander";
    }
}