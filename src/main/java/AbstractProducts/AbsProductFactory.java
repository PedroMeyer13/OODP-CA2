package AbstractProducts;

import Model.Product;

public abstract class AbsProductFactory {
    // creating variables that will be necessary for all abstract product factories
    protected int price;
    protected String name;

    // Method that will be called when creating a product
    public abstract Product createProduct();
}
