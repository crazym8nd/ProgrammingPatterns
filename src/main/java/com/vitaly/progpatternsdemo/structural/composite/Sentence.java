package com.vitaly.progpatternsdemo.structural.composite;

import java.util.List;

/*
09-Dec-23
gh /crazym8nd
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
