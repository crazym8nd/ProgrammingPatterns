package com.vitaly.progpatternsdemo.behavioral.interpreter;

/*
09-Dec-23
gh /crazym8nd
*/
public class NumberExpression extends Expression {
private final int number;

public NumberExpression(int number) {
    this.number = number;
}

public NumberExpression(String s) {
    this.number = Integer.parseInt(s);
}

@Override
public int interpret() {
    return number;
}

@Override
public String toString() {
    return "number";
}
}