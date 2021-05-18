package AbstractDepots;

import Model.Depot;
import Model.Product;
import java.util.ArrayList;

public abstract class AbsDepotFactory {

    // creating variables that will be necessary for all abstract factories
    protected Product nativeProduct;
    protected String name;
    protected int externalProduct;
    protected int nativeStock;
    protected int allowance;
    protected int deliveryPrice;
    protected int cashBalance;

    // Method that will be called when creating a product
    public abstract Depot createDepot();

}
