package com.vitaly.progpatternsdemo.creational.singleton;

/*
07-Dec-23
gh /crazym8nd
*/
public class SingletonDemo {
    public static void main(String[] args) {
        SingletonImpl singleton1 = SingletonImpl.getInstance("first");
        System.out.println("Создаем обьект" + singleton1);
        SingletonImpl singleton2 = SingletonImpl.getInstance("second");
        System.out.println("Пробуем создать обьект еще раз" + singleton2);

        System.out.println("Сравниваем обьекты singleton1 и singleton2");
        System.out.println(singleton1 == singleton2);
    }
}
