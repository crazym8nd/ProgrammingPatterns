package com.vitaly.progpatternsdemo.structural.adapter;

/*
09-Dec-23
gh /crazym8nd
*/
public class FirstBankAdapter extends FirstBank {
    private SecondBank secondBank;
    public FirstBankAdapter (SecondBank secondBank) {
        this.secondBank = secondBank;
    }
    public int getUsd() {
        int usd = secondBank.getTenge() / 460;
        return usd;
    }
    public String showBalance() {
        return (getUsd() + " доллар");
    }
}
