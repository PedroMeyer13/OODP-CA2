package MyDepots;

import Model.Depot;
import Model.Product;

import java.util.ArrayList;

public class DepotA extends Depot {

    // Defining a constructor for my depotA with the parameters inherited from Depot Model
    public DepotA(ArrayList<Product> nativeProduct, ArrayList<Product> externalProduct1, ArrayList<Product> externalProduct2, String name, int price, int allowance, int deliveryPrice, int cashBalance ){
        this.nativeProduct = nativeProduct;
        this.externalProduct1 = externalProduct1;
        this.externalProduct2 = externalProduct2;
        this.name = name;
        this.price = price;
        this.allowance = allowance;
        this.deliveryPrice = deliveryPrice;
        this.cashBalance = cashBalance;
    }

    // overriding this method to display information related to this depot
    @Override
    public String toString() {
        return "Depot Name: " + getName() + ", Native Product "+getNativeProduct() + "\n";
    }

}
