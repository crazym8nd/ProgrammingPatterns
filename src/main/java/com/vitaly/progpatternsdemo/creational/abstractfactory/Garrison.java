package com.vitaly.progpatternsdemo.creational.abstractfactory;

/*
07-Dec-23
gh /crazym8nd
*/
public abstract class Garrison {
    public Hero create(HeroFactory heroFactory, String HeroType) {
        Hero hero = createHero(HeroType);
        hero.setHeroType(heroFactory.createHeroType());
        return hero;
    }

    protected abstract Hero createHero(String type);
}
