package com.vitaly.progpatternsdemo.behavioral.command;

/*
09-Dec-23
gh /crazym8nd
*/
public class CarInvoker {
    public void setCommand(Command command) {
        this.command = command;
    }

    public Command command;
    public CarInvoker(Command command){
        this.command = command;
    }
    public void execute(){
        this.command.execute();
    }
}