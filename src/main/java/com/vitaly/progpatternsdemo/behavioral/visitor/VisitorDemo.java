package com.vitaly.progpatternsdemo.behavioral.visitor;

/*
09-Dec-23
gh /crazym8nd
*/
public class VisitorDemo {
    public static void main(String[] args) {

        Commander commander = new Commander(
                new Commander(new Soldier(), new Soldier(), new Soldier())
        );
        commander.accept(new SoldierVisitor());

        System.out.println();
        commander.accept(new CommanderVisitor());

    }
}