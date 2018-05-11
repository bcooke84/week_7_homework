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


}
