package MyDepots;

public class DepotA extends Depot {


    // Defining a constructor for my depotA
    public DepotA(int nativeProduct, int productB, int productC, int allowance, int productPrice,int deliveryPrice, int cashBalance ){

        this.nativeProduct = nativeProduct;
        this.productB = productB;
        this.productC = productC;
        this.allowance = allowance;
        this.productPrice = productPrice;
        this.deliveryPrice = deliveryPrice;
        this.cashBalance = cashBalance;
    }


    // overriding this method to display information related to this depot
    @Override
    public String toString() {
        return "Type: depotA, Native Products: " + getNativeProduct() + ", Product B: " + getProductB() + ", Product C: " + getProductC();
    }

}
