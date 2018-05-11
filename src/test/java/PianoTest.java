import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

     Piano piano;

    @Before
    public void before() {
        piano = new Piano(100.00, 150.00, "Wood", "Black", InstrumentType.KEYBOARD, 88);
    }

    @Test
    public void getCostPrice() {
        assertEquals(100, piano.getCostPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(150.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void getNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void getMarkup() {
        assertEquals(50.00, piano.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Plink, plonk!", piano.play());
    }
}
