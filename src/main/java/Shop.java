import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private double till;

    public Shop(String name, double till) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
        this.till = till;
    }

    public String getName(){
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getStockListSize(){
        return this.stock.size();
    }

    public void addToStock(ISell newItem){
        this.stock.add(newItem);
    }

    public void removeFromStock(ISell soldItem){
        this.stock.remove(soldItem);
    }

    public void clearWarehouse(ISell stock){
        this.stock.clear();
    }

    public double getTill() {
        return till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public void addMoneyFromBankToTill(double bankMoney){
        this.till += bankMoney;
    }

    public void addMoneyOfSaleToTill(ISell item){
        this.till += item.getSellPrice();
    }

    public void removeMoneyFromRefund(ISell item){
        this.till -= item.getSellPrice();
    }

    public void sellItem(ISell item){
        removeFromStock(item);
        addMoneyOfSaleToTill(item);
    }

    public void refundItem(ISell item){
        addToStock(item);
        removeMoneyFromRefund(item);
    }

    public double calculatePotentialProfit(){
        double profits = 0;
        for (ISell items : this.stock){
            profits += items.calculateMarkUp();
        }
        return profits;
    }

    public double returnProfitFromSale(ISell item){
        removeFromStock(item);
        addMoneyOfSaleToTill(item);
        return item.calculateMarkUp();
    }

    public void sellProductIfInStock(ISell item){
        if(this.stock == stock){
            removeFromStock(item);
            addMoneyOfSaleToTill(item);
        }
    }
}
