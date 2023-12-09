package com.vitaly.progpatternsdemo.behavioral.mediator;

/*
09-Dec-23
gh /crazym8nd
*/
public abstract class PartyMemberDefault implements PartyMember {

    protected Party party;

    @Override
    public void joinedParty(Party party) {
        System.out.println(this + " joined the party");
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(this + " " + action.getDescription());
    }

    @Override
    public void act(Action action) {
        if (party != null) {
            System.out.println(this + " " + action);
            party.act(this, action);
        }
    }

    @Override
    public abstract String toString();

}