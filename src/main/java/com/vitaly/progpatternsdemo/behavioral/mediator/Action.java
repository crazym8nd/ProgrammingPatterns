package com.vitaly.progpatternsdemo.behavioral.mediator;

/*
09-Dec-23
gh /crazym8nd
*/
public enum Action {
    TALE("tells a tale", "comes to listen"),
    GOLD("found gold", "takes his share of the gold");

    private final String title;
    private final String description;

    Action(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return title;
    }
}