package com.vitaly.progpatternsdemo.behavioral.visitor;

import java.util.Arrays;

/*
09-Dec-23
gh /crazym8nd
*/
public abstract class Unit {
    private final Unit[] children;

    protected Unit(Unit... children) {
        this.children = children;
    }

    public void accept(UnitVisitor visitor) {
        Arrays.stream(children).forEach(child -> child.accept(visitor));
    }
}