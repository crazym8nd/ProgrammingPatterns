package com.vitaly.progpatternsdemo.behavioral.iterator;

/*
09-Dec-23
gh /crazym8nd
*/
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
