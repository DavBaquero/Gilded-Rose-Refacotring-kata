package edu.badpals.gildedrose.item;

public class Sulfuras extends Item{


    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.name = "Sulfuras, Hand of Ragnaros";
        this.quality = 80;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getSellIn() {
        return super.getSellIn();
    }
    
    @Override
    public int getQuality(){
        return super.getQuality();
    }

    @Override
    public void setSellIn(int sellIn) {
        super.setSellIn(sellIn);
    }

    @Override
    public void setQuality(int quality) {
        super.setQuality(quality);
    }

    @Override
    public void update_sellIn() {
        setSellIn(this.sellIn);
    }

    @Override
    public void update_quality() {
        setQuality(80);
    }
}
