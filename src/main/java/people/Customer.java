package people;

import behaviours.ISell;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<ISell> purchasedProducts;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.purchasedProducts = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public int getPurchasedCount(){
        return this.purchasedProducts.size();
    }

    public void addPurchasedProduct(ISell product){
        this.purchasedProducts.add(product);
    }

    public void buyProduct(ISell product){
        addPurchasedProduct(product);
        this.wallet -= product.getSellPrice();
    }

    public void buyProductIfEnoughMoney(ISell product){
        if(this.wallet >= product.getSellPrice()){
            this.wallet -= product.getSellPrice();
        }
    }
}
