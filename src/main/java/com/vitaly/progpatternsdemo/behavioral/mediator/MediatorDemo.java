package com.vitaly.progpatternsdemo.behavioral.mediator;

/*
взаимосвязь между пати мемберами
*/
public class MediatorDemo {
    public static void main(String[] args) {


        Party party = new PartyImpl();
        Wizard wizard = new Wizard();
        Rogue rogue = new Rogue();


        party.addMember(wizard);
        party.addMember(rogue);



        wizard.act(Action.TALE);
        rogue.act(Action.GOLD);

    }
}