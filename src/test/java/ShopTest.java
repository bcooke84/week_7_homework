import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Item item;
    Saxophone saxophone;

    @Before
    public void before() {
        shop = new Shop();
        item = new Piano(100.00, 150.00, "Wood", "Black", InstrumentType.KEYBOARD, 88);
        saxophone = new Saxophone(100.00, 200.00, "Brass", "Gold", InstrumentType.WOODWIND, SaxPitch.ALTO);
        shop.addItemToStock(item);
    }

    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(saxophone);
        assertEquals(2, shop.countNumberOfItemsInStock());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.removeItemFromStock(item);
        assertEquals(0, shop.countNumberOfItemsInStock());
    }

    @Test
    public void cannotRemoveItem__doesNotExist() {
        shop.removeItemFromStock(saxophone);
        assertEquals(1, shop.countNumberOfItemsInStock());
    }

    @Test
    public void canGetTotalMarkupValue() {
        shop.addItemToStock(saxophone);
        assertEquals(150.00, shop.getTotalMarkupProfit(), 0.01);
    }

    @Test
    public void canGetStock() {
        shop.addItemToStock(saxophone);
        shop.addItemToStock(saxophone);
        assertEquals(3, shop.getStock().size());
    }

    @Test
    public void canGetTillBalance() {
        shop.setTill(10.00);
        assertEquals(10.00, shop.getTillBalance(), 0.01);
    }

    @Test
    public void canIncreaseBalance() {
        shop.increaseTillBalance(item);
        assertEquals(150.00,shop.getTillBalance(), 0.01);
    }

    @Test
    public void canSellItem() {
        shop.sellItem(item);
        assertEquals(150.00, shop.getTillBalance(), 0.01);
        assertEquals(0, shop.countNumberOfItemsInStock());
    }
}
