package com.vitaly.progpatternsdemo.behavioral.iterator;

/*
09-Dec-23
gh /crazym8nd
*/
public class IteratorDemo {
        private static final TreasureChest TREASURE_CHEST = new TreasureChest();

        private static void demonstrateTreasureChestIteratorForType(ItemType itemType) {
            System.out.println("------------------------");
            System.out.println("Item Iterator for ItemType " + itemType + ": ");

            Iterator<Item> itemIterator = TREASURE_CHEST.iterator(itemType);
            while (itemIterator.hasNext()) {
                System.out.println(itemIterator.next().toString());
            }
        }

    public static void main(String[] args) {

            demonstrateTreasureChestIteratorForType(ItemType.RING);
            demonstrateTreasureChestIteratorForType(ItemType.POTION);
            demonstrateTreasureChestIteratorForType(ItemType.WEAPON);
            demonstrateTreasureChestIteratorForType(ItemType.ANY);


        }
    }