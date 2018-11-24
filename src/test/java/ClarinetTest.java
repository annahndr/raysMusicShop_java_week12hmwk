import Instruments.Clarinet;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void setUp() throws Exception {
        clarinet = new Clarinet("black", InstrumentType.WOODWIND, 15, 25, "wood");
    }

    @Test
    public void canGetColour() {
        assertEquals("black", clarinet.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.WOODWIND, clarinet.getInstrumentType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("wood", clarinet.getMaterial());
    }

    @Test
    public void getSellingPrice() {
        assertEquals(25, clarinet.getSellPrice(), 0.01);
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(15, clarinet.getBuyPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("tune", clarinet.play());
    }
}
