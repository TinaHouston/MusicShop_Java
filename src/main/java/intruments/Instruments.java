package intruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instruments implements IPlay, ISell {

    private String material;
    private String colour;
    private InstrumentType instrumentType;


    public Instruments(String material, String colour, InstrumentType instrumentType) {
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public double calculateMarkUp(){
        return getSellPrice() - getPurchasePrice();
    }
}
