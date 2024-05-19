package edu.badpals.gildedrose;

import edu.badpals.gildedrose.item.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("Bienvenido a Ollivanders!");

        GildedRose tienda = new GildedRose();

        List<Updatable> items = List.of(new NormalItem("+5 Dexterity Vest", 10, 20),
                                         new AgedBrie("Aged Brie", 2, 0),
                                         new NormalItem("Elixir of the Mongoose", 5, 7),
                                         new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80),
                                         new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80),
                                         new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                                         new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                                         new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 49));
        
        for (Updatable item : items) {
            tienda.addItem(item);
        }

        System.out.println("\t ####  DAY 1 ####");
        System.out.println(tienda.toString());

        tienda.updateItem();

        System.out.println("\t ####  DAY 2 ####");
        System.out.println(tienda.toString());

       
        tienda.addItem(new Conjured("Conjured Mana Cake", 3, 6));
        System.out.println("\t ####  New item conjured added ####");
        System.out.println(tienda.toString());

        
        tienda.updateItem();
        System.out.println("\t ####  DAY 3 ####");
        System.out.println(tienda.toString());
    }
}