package edu.alenasoft;

public abstract class GildedItem {
  protected Item item;

  public GildedItem(Item item) {
    this.item = item;
  }

  public abstract void updateQuality();

  protected void decreaseSellIn() {
    item.setSellIn(item.getSellIn() - 1);
  }

  protected void increaseQuality() {
    if (item.getQuality() < 50) {
      item.setQuality(item.getQuality() + 1);
    }
  }

  protected void decreaseQuality() {
    if (item.getQuality() > 0) {
      item.setQuality(item.getQuality() - 1);
    }
  }
}
