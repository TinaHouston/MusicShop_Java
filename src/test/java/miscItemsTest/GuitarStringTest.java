package miscItemsTest;

import miscItems.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString("D String");
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(2, guitarString.getPurchasePrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(10, guitarString.getSellPrice(), 0.01);
    }
}
