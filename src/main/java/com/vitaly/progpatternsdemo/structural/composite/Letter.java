package com.vitaly.progpatternsdemo.structural.composite;

/*
09-Dec-23
gh /crazym8nd
*/
public class Letter extends LetterComposite {

    private final char character;

    public Letter(char character){
        this.character = character;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(character);
    }
}
