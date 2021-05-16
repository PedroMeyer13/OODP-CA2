package Model;

import java.util.ArrayList;

// Generic depot. Everything related to a depot is here
public abstract class Depot {

    // Common attributes for all depots
    protected ArrayList<Product> nativeProduct;
    protected ArrayList<Product> externalProduct1;
    protected ArrayList<Product> externalProduct2;
    protected String name;
    protected int price;
    protected int allowance;
    protected int deliveryPrice;
    protected int cashBalance;

    // setters and getter for all the parameters above

    public ArrayList<Product> getExternalProduct1() {
        return externalProduct1;
    }

    public void setExternalProduct1(ArrayList<Product> externalProduct1) {
        this.externalProduct1 = externalProduct1;
    }

    public ArrayList<Product> getExternalProduct2() {
        return externalProduct2;
    }

    public void setExternalProduct2(ArrayList<Product> externalProduct2) {
        this.externalProduct2 = externalProduct2;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Product> getNativeProduct() {
        return nativeProduct;
    }

    public void setNativeProduct(ArrayList<Product> nativeProduct) {
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
        cashBalance = cashBalance;
    }

}
