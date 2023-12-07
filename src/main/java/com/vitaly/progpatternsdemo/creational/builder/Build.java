package com.vitaly.progpatternsdemo.creational.builder;

/*
07-Dec-23
gh /crazym8nd
*/
public class Build {
    private Builder builder;
    public Build(int i){
        if(i == 1) {
            builder = new FirstBuilderImpl();
        } else if(i == 2) {
            builder = new SecondBuilderImpl();
        }
    }
    public Car buildCar(){
        return builder.buildCar();
    }
}
