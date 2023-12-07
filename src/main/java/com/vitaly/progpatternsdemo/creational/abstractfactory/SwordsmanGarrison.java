package com.vitaly.progpatternsdemo.creational.abstractfactory;

/*
07-Dec-23
gh /crazym8nd
*/
public class SwordsmanGarrison extends Garrison {

    @Override
    protected Hero createHero(String type) {
        return new SwordsmanHero(type);
    }
}
