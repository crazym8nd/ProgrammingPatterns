package com.vitaly.progpatternsdemo.creational.abstractfactory;

/*
07-Dec-23
gh /crazym8nd
*/
public class ArcherHeroFactory implements HeroFactory {

    @Override
    public HeroType createHeroType() {
        return new ArcherHeroType();
    }
}
