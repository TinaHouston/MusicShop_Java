package instrumentTests;

import intruments.InstrumentType;
import intruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Wood","Black", InstrumentType.GRAND_PIANO, 88);
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(300, piano.getPurchasePrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(450, piano.getSellPrice(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("plink plonk", piano.playSound());
    }
}
