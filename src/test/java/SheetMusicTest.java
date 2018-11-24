import ForSale.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new SheetMusic(5, 7, "Ukelele Songbook");
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(2, sheetMusic.calculateMarkup(), 0.01);
    }
}
