package com.vitaly.progpatternsdemo.structural.composite;

import java.util.List;

/*
дополнительная логика для создание предложений
*/
public class Sentence extends LetterComposite {
    public Sentence (List<Word> words){
        words.forEach(this::add);
    }
    @Override
    protected void printThisAfter(){
        System.out.println(".\n");
    }
}
