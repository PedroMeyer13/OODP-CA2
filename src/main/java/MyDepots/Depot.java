package MyDepots;

// Generic depot. Everything related to a depot is here
public abstract class Depot {

    // Common attributes for all cards
    protected int nativeProduct;
    protected int allowance;
    protected int productPrice;
    protected int deliveryPrice;
    protected int cashBalance;
    protected int productA;
    protected int productB;
    protected int productC;

    public int getProductA() {
        return productA;
    }

    public void setProductA(int productA) {
        this.productA = productA;
    }

    public int getProductB() {
        return productB;
    }

    public void setProductB(int productB) {
        this.productB = productB;
    }

    public int getProductC() {
        return productC;
    }

    public void setProductC(int productC) {
        this.productC = productC;
    }

    public int getNativeProduct() {
        return nativeProduct;
    }

    public void setNativeProduct(int nativeProduct) {
        this.nativeProduct = nativeProduct;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setAllowance(int allowance) {
        this.allowance = allowance;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
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

    // Standard toString method for all cards
    @Override
    public String toString() {
        return "Native Product " + getNativeProduct() + "Allowance " + getAllowance();
    }

}
