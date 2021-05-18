package AbstractDepots;

import Model.Depot;
import Model.Product;
import MyDepots.DepotC;

import java.util.ArrayList;

// This is the factory to create instances of a depot C object
public class DepotCFactory extends AbsDepotFactory{


    // Constructor of a Depot
    public DepotCFactory(Product nativeProduct, int externalProduct, int nativeSock,String name, int allowance, int deliveryPrice, int cashBalance ){
        this.nativeProduct = nativeProduct;
        this.externalProduct = externalProduct;
        this.nativeStock = nativeSock;
        this.name = name;
        this.allowance = allowance;
        this.deliveryPrice = deliveryPrice;
        this.cashBalance = cashBalance;
    }

    @Override
    public Depot createDepot() {
        return new DepotC(nativeProduct, externalProduct, nativeStock, name, allowance, deliveryPrice, cashBalance);
    }
}
