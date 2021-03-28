package instrumentTests;

import intruments.Guitar;
import intruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Wood", "Brown", InstrumentType.STRING, 6);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Brown", guitar.getColour());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasPurchasePrice(){
        assertEquals(150, guitar.getPurchasePrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(200, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("strum", guitar.playSound());
    }
}
