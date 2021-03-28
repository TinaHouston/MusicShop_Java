package miscItemsTest;

import miscItems.MusicBook;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicBookTest {

    MusicBook musicBook;

    @Before
    public void before(){
        musicBook = new MusicBook("Ludovico Einaudi");
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(5, musicBook.getPurchasePrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(12, musicBook.getSellPrice(), 0.01);
    }
}
