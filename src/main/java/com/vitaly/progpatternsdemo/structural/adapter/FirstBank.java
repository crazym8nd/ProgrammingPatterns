package com.vitaly.progpatternsdemo.structural.adapter;

/*
09-Dec-23
gh /crazym8nd
*/
class FirstBank {
    private int usd;
    public FirstBank () { usd = 1000;}
    public int getUsd() { return usd;
    }
    public String showBalance() {
        return (usd + " долларов");
    }
}
