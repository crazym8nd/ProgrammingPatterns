package com.vitaly.progpatternsdemo.structural.composite;

/*
09-Dec-23
gh /crazym8nd
*/
public class CompositeDemo {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();

        System.out.println("Message from the orcs: ");
        messenger.messageFromOrcs().print();

        System.out.println("Message from the elves: ");
        messenger.messageFromElves().print();
    }
}
