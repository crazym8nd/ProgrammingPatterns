package com.vitaly.progpatternsdemo.behavioral.visitor;

/*
09-Dec-23
gh /crazym8nd
*/
public interface UnitVisitor {
    void visit(Soldier soldier);
    void visit(Commander commander);

}
