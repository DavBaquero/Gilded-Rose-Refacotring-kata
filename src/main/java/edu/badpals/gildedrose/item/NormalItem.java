package edu.badpals.gildedrose.item;

public class NormalItem extends Item{

    public NormalItem(String name, int sellIn, int quality) {
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
        if(this.getQuality() > 50)
            this.setQuality(50);
        if(this.getSellIn() < 0)
            this.setQuality(getQuality() - 2);
        else
            this.setQuality(getQuality() - 1);
        if(this.getQuality() < 0)
            this.setQuality(0);

    }
}
