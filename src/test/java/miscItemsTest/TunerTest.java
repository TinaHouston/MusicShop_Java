package miscItemsTest;

import miscItems.Tuner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TunerTest {

    Tuner tuner;

    @Before
    public void before(){
        tuner = new Tuner("Guitar Tuner");
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(20, tuner.getPurchasePrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(35, tuner.getSellPrice(), 0.01);
    }
}
