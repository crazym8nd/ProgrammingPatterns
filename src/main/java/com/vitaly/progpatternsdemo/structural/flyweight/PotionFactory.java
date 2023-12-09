package com.vitaly.progpatternsdemo.structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

/*
09-Dec-23
gh /crazym8nd
*/
public class PotionFactory {
    private final Map<PotionType, Potion> potions;
    public PotionFactory(){
        potions = new EnumMap<>(PotionType.class);
    }
    Potion createPotion(PotionType type){
        Potion potion = potions.get(type);
        if(potion == null){
            switch (type){
                case HEALING:
                    potion = new HealingPotion();
                    break;
                case INVISIBILITY:
                    potion = new InvisibilityPotion();
                    break;
                    default:
                        System.out.println("Unsupported potion");

            } if (potion != null){
                potions.put(type, potion);
            }
        }
        return potion;
    }
}
