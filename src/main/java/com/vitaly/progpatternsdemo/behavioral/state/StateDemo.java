package com.vitaly.progpatternsdemo.behavioral.state;

/*
09-Dec-23
gh /crazym8nd
*/
public class StateDemo {
    public static void main(String[] args) {

        Mammoth mammoth = new Mammoth();
        mammoth.observe();
        System.out.println();

        mammoth.timePasses();
        mammoth.observe();
        System.out.println();

        mammoth.timePasses();
        mammoth.observe();

    }
}