package com.vitaly.progpatternsdemo.creational.prototype;

/*
07-Dec-23
gh /crazym8nd
*/
public class PinkLama implements Lama{
    private String name;

    public PinkLama(String name){
        this.name = name;
    }
    public Lama clone(){
        return new PinkLama(this.name);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
