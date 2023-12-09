package com.vitaly.progpatternsdemo.behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
09-Dec-23
gh /crazym8nd
*/
public class TreasureChest {
    private final List<Item> items;

    public TreasureChest() {
        items = Arrays.asList(
                new Item(ItemType.POTION, "Potion of courage"),
                new Item(ItemType.RING, "Ring of shadows"),
                new Item(ItemType.POTION, "Potion of wisdom"),
                new Item(ItemType.POTION, "Potion of blood"),
                new Item(ItemType.WEAPON, "Sword of silver +1"),
                new Item(ItemType.POTION, "Potion of rust"),
                new Item(ItemType.POTION, "Potion of healing"),
                new Item(ItemType.RING, "Ring of armor"),
                new Item(ItemType.WEAPON, "Steel halberd"),
                new Item(ItemType.WEAPON, "Dagger of poison"));
    }

    public Iterator<Item> iterator(ItemType itemType) {
        return new TreasureChestItemIterator(this, itemType);
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }
}