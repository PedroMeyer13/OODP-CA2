package AbstractDepots;

import Model.Depot;
import Model.Product;
import java.util.ArrayList;

public abstract class AbsDepotFactory {

    // creating variables that will be necessary for all abstract factories
    protected ArrayList<Product> nativeProduct;
    protected ArrayList<Product> externalProduct1;
    protected ArrayList<Product> externalProduct2;
    protected String name;
    protected int price;
    protected int allowance;
    protected int deliveryPrice;
    protected int cashBalance;

    // Method that will be called when creating a product
    public abstract Depot createDepot();

}
