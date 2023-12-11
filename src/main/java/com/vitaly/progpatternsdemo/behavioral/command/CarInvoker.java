package com.vitaly.progpatternsdemo.behavioral.command;

/*
обработчик, в качестве параметра передаем машину с которой он будет работать
*/
public class CarInvoker {
    public void setCommand(Command command) {
        this.command = command;
    }

    public  Command command;
    public CarInvoker(Command command){
        this.command = command;
    }
    public void execute(){
        this.command.execute();
    }
}