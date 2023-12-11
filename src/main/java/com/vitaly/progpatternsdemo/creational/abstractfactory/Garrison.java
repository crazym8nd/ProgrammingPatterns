package com.vitaly.progpatternsdemo.creational.abstractfactory;

/*

*/
public abstract class Garrison {
    public Hero create(HeroFactory heroFactory, String HeroType) {
        Hero hero = createHero(HeroType);
        hero.setHeroType(heroFactory.createHeroType());
        return hero;
    }

    protected abstract Hero createHero(String type);
}
