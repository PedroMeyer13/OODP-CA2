package AbstractDepots;

import Model.Depot;
import Model.Product;
import MyDepots.DepotB;

import java.util.ArrayList;

// This is the factory to create instances of a depot B object
public class DepotBFactory extends AbsDepotFactory{

    // Constructor of a Depot
    public DepotBFactory(Product nativeProduct, int externalProduct, int nativeStock ,String name, int price, int allowance, int deliveryPrice, int cashBalance ){
        this.nativeProduct = nativeProduct;
        this.externalProduct = externalProduct;
        this.nativeStock = nativeStock;
        this.name = name;
        this.price = price;
        this.allowance = allowance;
        this.deliveryPrice = deliveryPrice;
        this.cashBalance = cashBalance;
    }


    @Override
    public Depot createDepot() {
        return new DepotB(nativeProduct, externalProduct, nativeStock,name, price, allowance, deliveryPrice, cashBalance);
    }
}
