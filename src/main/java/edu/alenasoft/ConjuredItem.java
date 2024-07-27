package edu.alenasoft;

public class ConjuredItem extends GildedItem {
  public ConjuredItem(Item item) {
    super(item);
  }

  @Override
  public void updateQuality() {
    decreaseQuality();
    decreaseQuality();
    decreaseSellIn();

    if (item.getSellIn() < 0) {
      decreaseQuality();
      decreaseQuality();
    }
  }
}