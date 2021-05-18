package Model;

import java.util.ArrayList;

// Generic depot. Everything related to a depot is here
public abstract class Depot {

    // Common attributes for all depots
    protected Product nativeProduct;
    protected String name;
    protected int externalProduct;
    protected int nativeStock;
    protected int allowance;
    protected int deliveryPrice;
    protected int cashBalance;

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
        cashBalance = cashBalance;
    }

}
