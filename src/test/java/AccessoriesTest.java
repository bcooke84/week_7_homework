import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoriesTest {

    Accessory accessory;

    @Before
    public void before() {
        accessory = new Accessory("Sheet Music", 2.5, 5.0);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Sheet Music", accessory.getDescription());
    }

    @Test
    public void canGetCostPrice() {
        assertEquals(2.50, accessory.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(5.0, accessory.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(2.50, accessory.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetMarkUpPercentage() {
        assertEquals(100, accessory.calculateMarkupPercentage(), 0.01);
    }
}
