package MyDepots;

import Model.Product;
import Model.Tradeinfo;

import java.util.ArrayList;

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


    public ArrayList<Tradeinfo> getTrade() {
        return trade;
    }

    public void setTrade(ArrayList<Tradeinfo> trade) {
        this.trade = trade;
    }

    protected ArrayList<Tradeinfo> trade = new ArrayList<>();

public Depots(String name, Product nativeProduct){
            this.name = name;
            this.nativeProduct = nativeProduct;
            this.nativeStock = getRandomNumber(15,50);
            this.externalProduct = getRandomNumber(3,40);
            this.allowance = getRandomNumber(50,100);
            nativeProduct.setPrice(getRandomNumber(1,10));
            nativeProduct.setDelivery(getRandomNumber(1,10));


}
    // setters and getter for all the parameters above

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

    private int getRandomNumber(int min, int max){
        int random_int = (int)Math.floor(Math.random()*(max-min+1) + min);
        return random_int;
    }

}
