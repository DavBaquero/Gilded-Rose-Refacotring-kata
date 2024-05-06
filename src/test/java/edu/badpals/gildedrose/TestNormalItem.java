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
}
