package intruments;

public class Guitar extends Instruments {

    private int numberOfStrings;

    public Guitar(String material, String colour, InstrumentType instrumentType, int numberOfStrings) {
        super(material, colour, instrumentType);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    public double getPurchasePrice(){
        return 150.00;
    }

    public double getSellPrice(){
        return 200.00;
    }

    public String playSound(){
        return "strum";
    }

}
