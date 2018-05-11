import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet(50.00, 100.00, "Brass", "Gold", InstrumentType.BRASS, 3);
    }

    @Test
    public void canGetNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void getCostPrice() {
        assertEquals(50.00, trumpet.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(100.00, trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Gold", trumpet.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

}
