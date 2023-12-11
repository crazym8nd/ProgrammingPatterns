package com.vitaly.progpatternsdemo.behavioral.templatemethod;

/*
в данном случае омжно было сделать через перегрузку методов
*/
public class TemplateMethodDemo {
    public static void main(String[] args) {


        Thief thief = new Thief(new HitAndRunMethod());
        thief.steal();

        System.out.println();
        thief.changeMethod(new ConfuselMethod());
        thief.steal();
    }
}


