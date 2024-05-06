package edu.badpals.gildedrose;

import edu.badpals.gildedrose.item.Item;
import edu.badpals.gildedrose.item.NormalItem;
import edu.badpals.gildedrose.item.Updatable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNormalItem {

    @Test
    void normalItemTest() {

        NormalItem item = new NormalItem("+5 Dexterity Vest", 10, 20);
        item.update_quality();
        assertEquals(19, item.getQuality());
        assertEquals(9, item.getSellIn());
    }

    @Test
    void overQualityTest() {

        NormalItem item = new NormalItem("Dragon's Chest", 20, 60);
        item.update_quality();
        assertEquals(49, item.getQuality());
        assertEquals(19, item.getSellIn());
    }

    @Test
    void spoiledItemTest() {

        NormalItem item = new NormalItem("Golden Breastplate", -2, 10);
        item.update_quality();
        assertEquals(8, item.getQuality());
        assertEquals(-3, item.getSellIn());
    }
}
