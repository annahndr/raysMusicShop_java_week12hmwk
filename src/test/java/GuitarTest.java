import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("blue", InstrumentType.STRINGS, 22.00, 30.99, "acoustic");
    }

    @Test
    public void canGetColour() {
        assertEquals("blue", guitar.getColour());
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.STRINGS, guitar.getInstrumentType());
    }

    @Test
    public void canGetGuitarType() {
        assertEquals("acoustic", guitar.getGuitarType());
    }

    @Test
    public void canGetBuyingPrice() {
        assertEquals(22, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(30.99, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("tune", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(8.99, guitar.calculateMarkup(), 0.01);
    }
}
