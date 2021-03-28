package intruments;

public class Violin extends Instruments {

    private int numberOfStrings;

    public Violin(String material, String colour, InstrumentType instrumentType, int numberOfStrings) {
        super(material, colour, instrumentType);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    public double getPurchasePrice(){
        return 70.00;
    }

    public double getSellPrice(){
        return 130.00;
    }

    public String playSound(){
        return "squeak";
    }
}
