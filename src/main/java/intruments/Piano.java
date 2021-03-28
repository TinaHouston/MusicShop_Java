package intruments;

public class Piano extends Instruments {

    private int numberOfKeys;

    public Piano(String material, String colour, InstrumentType instrumentType, int numberOfKeys) {
        super(material, colour, instrumentType);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys(){
        return numberOfKeys;
    }

    public double getPurchasePrice(){
        return 300.00;
    }

    public double getSellPrice(){
        return 450.00;
    }

    public String playSound(){
        return "plink plonk";
    }
}
