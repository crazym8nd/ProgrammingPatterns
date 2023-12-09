package com.vitaly.progpatternsdemo.behavioral.memento;

import java.util.Stack;

/*
09-Dec-23
gh /crazym8nd
*/
public class MementoDemo {
    public static void main(String[] args) {
        Stack<StarMemento> states = new Stack<StarMemento>();

        Star star = new Star(StarType.SUN, 10000000, 500000);
        System.out.println(star.toString());
        System.out.println();

        states.add(star.getMemento());

        star.timePasses();
        System.out.println(star.toString());
        states.add(star.getMemento());
        System.out.println();

        star.timePasses();
        System.out.println(star.toString());
        states.add(star.getMemento());
        System.out.println();

        star.timePasses();
        System.out.println(star.toString());
        states.add(star.getMemento());
        System.out.println();

        star.timePasses();
        System.out.println(star.toString());
        System.out.println();
        while (states.size() > 0) {
            star.setMemento(states.pop());
            System.out.println(star.toString());
        }
    }
}
