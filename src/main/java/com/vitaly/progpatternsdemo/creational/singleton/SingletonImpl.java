package com.vitaly.progpatternsdemo.creational.singleton;

/*
делаем потокобезопасный синглтон, но ресурсоемкий

*/
public final class SingletonImpl {
    //многопоточная защита в виде volatile и syncronized
    private static volatile SingletonImpl instance;

    public String value;
    //сделав его приватным ограничили возможность создания извне (new)
    private SingletonImpl(String value){
        this.value = value;
    }


//проверяем, создавали ли его уже и создаем, если нет
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
