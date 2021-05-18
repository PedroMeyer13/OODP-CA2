package MyDepots;

import Model.Depot;
import Model.Product;

import java.util.ArrayList;

public class DepotC extends Depot {

    // Defining a constructor for my depotA with the parameters inherited from Depot Model
    public DepotC(Product nativeProduct, int externalProduct, int nativeStock ,String name, int allowance, int deliveryPrice, int cashBalance ){
        this.nativeProduct = nativeProduct;
        this.externalProduct = externalProduct;
        this.nativeStock = nativeStock;
        this.name = name;
        this.allowance = allowance;
        this.deliveryPrice = deliveryPrice;
        this.cashBalance = cashBalance;
    }

    // overriding toString method to display information related to this depot
    @Override
    public String toString() {
        return "Depot Name: " + getName() +
                ", Native Product: " + getNativeProduct().getName() +
                ", Native Sock: " +  getNativeStock() +
                ", Depot external Product:" + getExternalProduct() +
                ", Depot delivery price: " + getDeliveryPrice() +
                ", Allowance: " + getAllowance() +
                ", Cash balance: " + getCashBalance() +
                "\n";
    }
}
