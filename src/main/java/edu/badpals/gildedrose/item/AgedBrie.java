package edu.badpals.gildedrose.item;

public class AgedBrie extends Item{

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public int getQuality() {
        return super.getQuality();
    }

    @Override
    public int getSellIn() {
        return super.getSellIn();
    }

    @Override
    public void setQuality(int quality) {
        super.setQuality(quality);
    }

    @Override
    public void setSellIn(int sellIn) {
        super.setSellIn(sellIn);
    }

    @Override
    public void update_sellIn() {
        this.setSellIn(this.getSellIn() - 1);
    }

    @Override
    public void update_quality() {
        this.update_sellIn();
        if (getSellIn() > 0)
            this.setQuality(getQuality() + 1);
        else
            this.setQuality(getQuality() + 2);
    }
}
