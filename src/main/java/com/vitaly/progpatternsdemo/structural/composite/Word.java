package com.vitaly.progpatternsdemo.structural.composite;

import java.util.List;/*
вносим необходимую логику для компоновке на более высоком уровне
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

