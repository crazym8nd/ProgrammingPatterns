package com.vitaly.progpatternsdemo.structural.composite;

import java.util.Arrays;
import java.util.List;

/*
09-Dec-23
gh /crazym8nd
*/
public class Messenger {

    LetterComposite messageFromOrcs(){
        List<Word> words = Arrays.asList(new Word('T', 'h', 'e', 'r', 'e'),
                new Word('i', 's'),
                new Word('a'),
                new Word('w', 'a', 'y'));
        return new Sentence(words);
    }
    LetterComposite messageFromElves() {

        List<Word> words = Arrays.asList(
                new Word('Y','e', 's', ','),
                new Word('y','e', 's'));
        return new Sentence(words);
    }
}
