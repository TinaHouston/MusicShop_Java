package instrumentTests;

import intruments.InstrumentType;
import intruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin("Wood", "Brown", InstrumentType.STRING, 4);
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(70, violin.getPurchasePrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(130, violin.getSellPrice(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("squeak", violin.playSound());
    }
}
