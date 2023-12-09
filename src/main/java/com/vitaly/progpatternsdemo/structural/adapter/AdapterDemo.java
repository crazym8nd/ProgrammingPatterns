package com.vitaly.progpatternsdemo.structural.adapter;

/*
09-Dec-23
gh /crazym8nd
*/
public class AdapterDemo {
    public static void main(String[] args) {
        FirstBank firstBank = new FirstBank();
        SecondBank secondBank = new SecondBank();
        FirstBankAdapter firstBankAdapter = new FirstBankAdapter(secondBank);
        System.out.println("Ваш счет в первом банке: " + firstBank.showBalance());
        System.out.println("Ваш счет во втором банке: " + secondBank.showBalance());
        System.out.println("Ваш счет во втором банке в долларах: " + firstBankAdapter.showBalance());

    }
}
