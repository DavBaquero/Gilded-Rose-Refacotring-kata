package edu.badpals.gildedrose;

import edu.badpals.gildedrose.item.Item;
import edu.badpals.gildedrose.item.Updatable;

import java.util.ArrayList;
import java.util.List;

class GildedRose {
    private List<Updatable> items = new ArrayList<Updatable>();

    public GildedRose() {}

    public List<Updatable> getItems(){
        return this.items;
    }

    public void addItem(Updatable item){
        getItems().add(item);
    }

    public void updateItem(){
        for(Updatable item: getItems()){
            item.update_sellIn();
            item.update_quality();
        }
    }

    @Override
    public String toString() {
        StringBuilder inventario = new StringBuilder();
        for (Updateable item : getItems()) {
            inventario.append(item.toString());
            inventario.append('\n');
        }
        return inventario.toString();
    }
}

