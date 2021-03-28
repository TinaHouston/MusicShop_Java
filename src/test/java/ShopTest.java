import intruments.Guitar;
import intruments.InstrumentType;
import intruments.Piano;
import miscItems.MusicBook;
import miscItems.Tuner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    MusicBook musicBook;
    Tuner tuner;
    Tuner pianoTuner;

    @Before
    public void before(){
        shop = new Shop("Glasgow Music Shop", 2000.00);
        piano = new Piano("Wood", "Black", InstrumentType.KEYBOARD, 61);
        guitar = new Guitar("Wood", "Brown", InstrumentType.STRING, 6);
        musicBook = new MusicBook("Guitar Music");
        tuner = new Tuner("Guitar tuner");
        pianoTuner = new Tuner("Piano Tuner");
    }

    @Test
    public void getTillTotal(){
        assertEquals(2000.00, shop.getTill(), 0.01);
    }

    @Test
    public void canAddMoneyFromBankToTill(){
        shop.addMoneyFromBankToTill(1000);
        assertEquals(3000, shop.getTill(), 0.01);
    }

    @Test
    public void canSellItemRemoveStockAddTillMoney(){
        shop.addToStock(guitar);
        shop.addToStock(piano);
        shop.sellItem(guitar);
        assertEquals(2200.00, shop.getTill(), 0.01);
        assertEquals(1, shop.getStockListSize());
    }

    @Test
    public void canRefundItemAddStockRemoveTillMoney(){
        shop.refundItem(guitar);
        assertEquals(1800.00, shop.getTill(), 0.01);
        assertEquals(1, shop.getStockListSize());
    }

    @Test
    public void canCalculateProfitsFromStock(){
        shop.addToStock(guitar);
        shop.addToStock(musicBook);
        assertEquals(57.00, shop.calculatePotentialProfit(), 0.01);
    }

    @Test
    public void canCalculateProfitFromSale(){
        assertEquals(50.00, shop.returnProfitFromSale(guitar), 0.01);
    }

    @Test
    public void canSellWhenInStock(){
        shop.addToStock(guitar);
        shop.sellItem(guitar);
        assertEquals(0, shop.getStockListSize());
    }

    @Test
    public void cantSellWhenOutOfStock(){
        shop.addToStock(guitar);
        shop.sellProductIfInStock(piano);
        assertEquals(1, shop.getStockListSize());
    }
}
