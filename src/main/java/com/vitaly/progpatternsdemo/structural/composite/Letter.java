package com.vitaly.progpatternsdemo.structural.composite;

/*
09-Dec-23
реализация компоновки на самом базовом уровне
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
