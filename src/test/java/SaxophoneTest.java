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
}
