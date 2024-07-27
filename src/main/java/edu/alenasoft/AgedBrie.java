package edu.alenasoft;

public class AgedBrie extends GildedItem {
  public AgedBrie(Item item) {
    super(item);
  }

  @Override
  public void updateQuality() {
    increaseQuality();
    decreaseSellIn();

    if (item.getSellIn() < 0) {
      increaseQuality();
    }
  }
}
