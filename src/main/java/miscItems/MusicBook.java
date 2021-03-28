package miscItems;

public class MusicBook extends MiscItems {

    public MusicBook(String name) {
        super(name);
    }

    public double getPurchasePrice(){
        return 5.00;
    }

    public double getSellPrice(){
        return 12.00;
    }
}
