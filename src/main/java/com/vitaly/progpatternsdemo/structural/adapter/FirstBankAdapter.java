package com.vitaly.progpatternsdemo.structural.adapter;

/*
09-Dec-23
gh /crazym8nd
*/
public class FirstBankAdapter extends FirstBank {
    private final SecondBank secondBank;
    public FirstBankAdapter (SecondBank secondBank) {
        this.secondBank = secondBank;
    }
    @Override
    public int getUsd() {
        return secondBank.getTenge() / 460;
    }
    @Override
    public String showBalance() {
        return (getUsd() + " доллар");
    }
}
