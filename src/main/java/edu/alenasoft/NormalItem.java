package edu.alenasoft;

public class NormalItem extends GildedItem {
  public NormalItem(Item item) {
    super(item);
  }

  @Override
  public void updateQuality() {
    decreaseQuality();
    decreaseSellIn();

    if (item.getSellIn() < 0) {
      decreaseQuality();
    }
  }
}