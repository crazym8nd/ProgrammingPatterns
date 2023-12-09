package com.vitaly.progpatternsdemo.behavioral.mediator;

/*
09-Dec-23
gh /crazym8nd
*/
public interface PartyMember {

    void joinedParty(Party party);

    void partyAction(Action action);

    void act(Action action);
}