package Model;

import Model.Product;
import Model.TradeInfo;

import java.util.ArrayList;

// this class creates a new depot
public class Depots {

    // Common attributes for all depots
    protected Product nativeProduct;
    protected String name;
    protected int externalProduct;
    protected int nativeStock;
    protected int allowance;
    protected int deliveryPrice;
    protected int cashBalance;
    protected int price;


    // constructor of a depot
    public Depots(String name, Product nativeProduct) {
        this.name = name;
        this.nativeProduct = nativeProduct;
        this.nativeStock = getRandomNumber(15, 50);
        this.externalProduct = getRandomNumber(3, 40);
        this.allowance = getRandomNumber(50, 100);
        this.price = (getRandomNumber(1, 10));
        this.deliveryPrice = (getRandomNumber(1, 10));


    }
    // setters and getter for all the parameters above

    public ArrayList<TradeInfo> getTrade() {
        return trade;
    }

    public void setTrade(ArrayList<TradeInfo> trade) {
        this.trade = trade;
    }

    protected ArrayList<TradeInfo> trade = new ArrayList<>();

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNativeStock() {
        return nativeStock;
    }

    public void setNativeStock(int nativeStock) {
        this.nativeStock = nativeStock;
    }

    public int getExternalProduct() {
        return externalProduct;
    }

    public void setExternalProduct(int externalProduct) {
        this.externalProduct = externalProduct;
    }

    public Product getNativeProduct() {
        return nativeProduct;
    }

    public void setNativeProduct(Product nativeProduct) {
        this.nativeProduct = nativeProduct;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(int deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public int getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(int cashBalance) {
        this.cashBalance = cashBalance;
    }

    private int getRandomNumber(int min, int max) {
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }

    @Override
    public String toString() {
        return "Depot: "+ getName() +
                " Native Product: " + getNativeProduct() +
                " Native Stock: " + getNativeStock() +
                " External Stock: " +getExternalProduct() +
                " Allowance: " + getAllowance() +
                " Product Price: " + getPrice() +
                " Delivery Price " + getDeliveryPrice()
                ;
    }
}
