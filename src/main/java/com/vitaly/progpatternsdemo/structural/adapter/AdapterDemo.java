package com.vitaly.progpatternsdemo.structural.adapter;

/*
создаем экхемпляры
*/
public class AdapterDemo {
    public static void main(String[] args) {
        FirstBank firstBank = new FirstBank();
        SecondBank secondBank = new SecondBank();
        FirstBankAdapter firstBankAdapter = new FirstBankAdapter(secondBank);


        System.out.println("Ваш счет в первом банке: " + firstBank.showBalance());
        System.out.println("Ваш счет во втором банке: " + secondBank.showBalance());

        //принимает firstbank в качестве параметра конструктора
        //реализует интерфейс firstbank и вызывает метод у обьекта secondbank
        System.out.println("Ваш счет во втором банке в долларах: " + firstBankAdapter.showBalance());

    }
}
