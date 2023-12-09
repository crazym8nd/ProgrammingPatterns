package com.vitaly.progpatternsdemo.behavioral.templatemethod;

/*
09-Dec-23
gh /crazym8nd
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


