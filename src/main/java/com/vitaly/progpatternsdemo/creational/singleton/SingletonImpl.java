package com.vitaly.progpatternsdemo.creational.singleton;

/*
07-Dec-23
gh /crazym8nd
*/
public final class SingletonImpl {
    private static volatile SingletonImpl instance;

    public String value;
    private SingletonImpl(String value){
        this.value = value;
    }

    public static SingletonImpl getInstance(String value){
        SingletonImpl check = instance;
        if (check != null){
            return check;
        }
        synchronized(SingletonImpl.class){
            if (instance == null){
                instance = new SingletonImpl(value);
            }
            return instance;
        }
    }
    @Override
    public String toString(){
        return "\n"+"Я родился " + value;
    }
}
