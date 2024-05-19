package edu.badpals.gildedrose.item;

import edu.badpals.gildedrose.item.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

    private GildedRose shop;
    private NormalItem normal = null;
    private AgedBrie brie = null;

    @Before
    public void setupInventario() {
       shop = new GildedRose();
       normal = new NormalItem("+5 Dexterity Vest", 10, 20);
       brie = new AgedBrie("Aged Brie", 2, 0);
    }

    @Test
    public void toStringTest() {
        shop.addItem(brie);
        brie = new AgedBrie("Aged Brie", 10, 10);
        shop.addItem(brie);
        System.out.println("toString() GildedRose test:");
        System.out.println(shop.toString());
    }

    @Test
    public void addItemTest() {
        shop.addItem(normal);
        shop.addItem(brie);
        assertEquals(2, shop.getItems().size(), 0);
    }

    @Test
    public void updateItem() {
        shop.addItem(normal);
        shop.addItem(brie);
        assertEquals(2, shop.getItems().size(), 0);
        System.out.println("Dia 0:" + '\n' + shop.toString());
        shop.updateItem();
        
        NormalItem item = (NormalItem) shop.getItems().get(0);
        AgedBrie itemBrie = (AgedBrie) shop.getItems().get(1);
        assertEquals(19, item.getQuality(), 0);
        assertEquals(1, itemBrie.getQuality(), 0);
        System.out.println("Dia 1:" + '\n' + shop.toString());
    }
}
