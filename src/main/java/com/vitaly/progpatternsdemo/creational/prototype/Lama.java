package com.vitaly.progpatternsdemo.creational.prototype;

/*
07-Dec-23
gh /crazym8nd
*/
public interface Lama {
    Lama copy();
    String getName();
    void setName(String name);
}
