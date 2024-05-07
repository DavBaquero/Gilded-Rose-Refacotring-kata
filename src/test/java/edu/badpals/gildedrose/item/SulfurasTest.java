package edu.badpals.gildedrose;

import edu.badpals.gildedrose.item.Sulfuras;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSulfuras {

    @Test
    void sulfurasTest() {

        Sulfuras hammer = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        hammer.update_quality();
        assertEquals(80, hammer.getQuality());
        assertEquals(0, hammer.getSellIn());
    }

    @Test
    void wrongInputSulfurasTest() {

        Sulfuras hammer = new Sulfuras("Martillo", 2, 20);
        hammer.update_quality();
        assertEquals("Sulfuras, Hand of Ragnaros", hammer.getName());
        assertEquals(80, hammer.getQuality());
        assertEquals(2, hammer.getSellIn());
    }

}
