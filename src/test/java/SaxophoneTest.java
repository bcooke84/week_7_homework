import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone(100.00, 150.00, "Brass", "Gold", InstrumentType.WOODWIND, SaxPitch.ALTO);
    }

    @Test
    public void canGetPitch() {
        assertEquals(SaxPitch.ALTO, saxophone.getSaxPitch());
    }

    @Test
    public void getCostPrice() {
        assertEquals(100, saxophone.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(150.00, saxophone.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Gold", saxophone.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.WOODWIND, saxophone.getType());
    }

}
