package com.vitaly.progpatternsdemo.structural.adapter;

/*
09-Dec-23
gh /crazym8nd
*/
class SecondBank {
    private int tenge;
    public SecondBank () { tenge = 10000;}
    public int getTenge() { return tenge; }
    public String showBalance() {
        return (tenge + " тенге");
    }
}

