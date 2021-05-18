package AbstractDepots;

import Model.Depot;
import Model.Product;
import MyDepots.DepotA;

import java.util.ArrayList;

// This is the factory to create instances of a depot A object
public class DepotAFactory extends AbsDepotFactory{

    // Constructor of a Depot
    public DepotAFactory(Product nativeProduct, int externalProduct, int nativeStock ,String name, int allowance, int deliveryPrice, int cashBalance ){
        this.nativeProduct = nativeProduct;
        this.externalProduct = externalProduct;
        this.nativeStock = nativeStock;
        this.name = name;
        this.allowance = allowance;
        this.deliveryPrice = deliveryPrice;
        this.cashBalance = cashBalance;
    }

    @Override
    public Depot createDepot() {
        return new DepotA(nativeProduct, externalProduct, nativeStock,name, allowance, deliveryPrice, cashBalance);
    }
}
