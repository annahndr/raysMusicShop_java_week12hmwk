import ForSale.SheetMusic;
import Instruments.Clarinet;
import Instruments.Guitar;
import Instruments.InstrumentType;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Clarinet clarinet;
    SheetMusic sheetMusic;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop();
        clarinet = new Clarinet("red", InstrumentType.WOODWIND, 30.50, 44, "wood");
        guitar = new Guitar ("green", InstrumentType.STRINGS, 50, 88.20, "electric");
        sheetMusic = new SheetMusic(3, 5, "Bach");
    }

    @Test
    public void canAddStockToShop() {
        shop.addStock(clarinet);
        shop.addStock(sheetMusic);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canRemoveStockFromShop() {
        shop.addStock(clarinet);
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canGetTotalPotentialProfit() {
        shop.addStock(sheetMusic);
        shop.addStock(guitar);
        assertEquals(40.20, shop.calculateProfit(), 0.01);
    }
}
