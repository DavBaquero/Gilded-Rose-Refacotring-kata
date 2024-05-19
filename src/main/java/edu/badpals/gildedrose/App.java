package edu.badpals.gildedrose.item;

public class App {
    public static void main(String[] args) {

        System.out.println("Bienvenido a Ollivanders!");

        GildedRose tienda = new GildedRose();

        List<Updateable> items = List.of(new NormalItem("+5 Dexterity Vest", 10, 20),
                                         new AgedBrie("Aged Brie", 2, 0),
                                         new NormalItem("Elixir of the Mongoose", 5, 7),
                                         new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80),
                                         new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80),
                                         new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                                         new Backstage("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                                         new Backstage("Backstage passes to a TAFKAL80ETC concert", 5, 49));
        
        for (Updateable item : items) {
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