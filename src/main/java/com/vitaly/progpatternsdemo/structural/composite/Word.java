package com.vitaly.progpatternsdemo.structural.composite;

import java.util.List;/*
09-Dec-23
gh /crazym8nd
*/
public class Word extends LetterComposite {
    public Word(List<Letter> letters) {
        letters.forEach(this::add);
        }
        public Word(char... letters){
        for (char letter : letters){
            this.add(new Letter(letter));
        }
    }
    @Override
    protected void printThisBefore(){
        System.out.print(" ");
    }

}

