package com.vitaly.progpatternsdemo.creational.prototype;

/*
07-Dec-23
gh /crazym8nd
*/
public class RainbowLama implements Lama {
    private String name;

    public RainbowLama(String name) {
        this.name = name;
    }

    public Lama copy() {
        return new RainbowLama(this.name);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
    this.name = name;
    }
}