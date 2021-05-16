package AbstractDepots;

import Model.Depot;
import Model.Product;
import MyDepots.DepotC;

import java.util.ArrayList;

// This is the factory to create instances of a depot C object
public class DepotCFactory extends AbsDepotFactory{


    // Constructor of a Depot
    public DepotCFactory(ArrayList<Product> nativeProduct, ArrayList<Product> externalProduct1, ArrayList<Product> externalProduct2, String name, int price, int allowance, int deliveryPrice, int cashBalance ){
        this.nativeProduct = nativeProduct;
        this.externalProduct1 = externalProduct1;
        this.externalProduct2 = externalProduct2;
        this.name = name;
        this.price = price;
        this.allowance = allowance;
        this.deliveryPrice = deliveryPrice;
        this.cashBalance = cashBalance;
    }

    @Override
    public Depot createDepot() {
        return new DepotC(nativeProduct, externalProduct1, externalProduct2, name, price, allowance, deliveryPrice, cashBalance);
    }
}
