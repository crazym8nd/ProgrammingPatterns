package com.vitaly.progpatternsdemo.behavioral.interpreter;

/*
09-Dec-23
gh /crazym8nd
*/
public abstract class Expression {
    public abstract int interpret();
    @Override
    public abstract String toString();
}
