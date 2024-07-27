package edu.alenasoft;

public class BackstagePass extends GildedItem {
  public BackstagePass(Item item) {
    super(item);
  }

  @Override
  public void updateQuality() {
    increaseQuality();

    if (item.getSellIn() < 11) {
      increaseQuality();
    }

    if (item.getSellIn() < 6) {
      increaseQuality();
    }

    decreaseSellIn();

    if (item.getSellIn() < 0) {
      item.setQuality(0);
    }
  }
}
