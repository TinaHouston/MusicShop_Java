package miscItems;

import behaviours.ISell;

public abstract class MiscItems implements ISell {

    private String name;

    public MiscItems(String name) {
        this.name = name;
    }

    public double calculateMarkUp(){
        return getSellPrice() - getPurchasePrice();
    }
}
