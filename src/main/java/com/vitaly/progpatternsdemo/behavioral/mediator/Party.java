package com.vitaly.progpatternsdemo.behavioral.mediator;

/*
09-Dec-23
gh /crazym8nd
*/
public interface Party {

    void addMember(PartyMember member);

    void act(PartyMember actor, Action action);

}