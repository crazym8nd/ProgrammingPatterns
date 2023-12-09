package com.vitaly.progpatternsdemo.structural.flyweight;

import java.util.Arrays;
import java.util.List;

/*
09-Dec-23
gh /crazym8nd
*/
public class PotionShop {
    private final List<Potion> firstShelf;
    private final List<Potion> secondShelf;

    public PotionShop(){
        PotionFactory factory = new PotionFactory();
        firstShelf = Arrays.asList(
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.HEALING)
        );
        secondShelf = Arrays.asList(
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.INVISIBILITY)
        );
    }
    public final List<Potion> getFirstShelf() {
        return firstShelf;
    }
    public final List<Potion> getSecondShelf() {
        return secondShelf;
    }

    public void drinkPotions(){
        System.out.println("Drinking first shelf potions");
        firstShelf.forEach(Potion::drink);

        System.out.println("Drinking second shelf potions");
        secondShelf.forEach(Potion::drink);
    }

}
