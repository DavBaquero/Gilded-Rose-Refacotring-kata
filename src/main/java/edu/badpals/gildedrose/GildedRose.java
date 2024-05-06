package edu.badpals.gildedrose;

import edu.badpals.gildedrose.item.Item;
import edu.badpals.gildedrose.item.Updatable;

import java.util.ArrayList;
import java.util.List;

class GildedRose {
    List<Updatable> items = new ArrayList<Updatable>();

    public GildedRose(List<Updatable> items) {

        this.items = items;
    }

   /* public void updateItem(){
        for(Updatable item: this.items){
            item.update_sellIn();
            item.update_quality();
        }
    }*/
}

