package com.vitaly.progpatternsdemo.structural.composite;

import java.util.ArrayList;
import java.util.List;

/*
09-Dec-23
gh /crazym8nd
*/
public abstract class LetterComposite {
    private final List<LetterComposite> children = new ArrayList<>();
    public void add(LetterComposite letter){
        children.add(letter);
    }
    public int count(){
        return children.size();
    }
    protected void printThisBefore(){}

    protected void printThisAfter(){}
    public void print(){
        printThisBefore();
        children.forEach(LetterComposite::print);
        printThisAfter();
    }
}
