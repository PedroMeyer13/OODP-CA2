package AbstractProducts;

import Model.Product;
import Product.*;
    // class that will create the Product B
public class ProductCFactory extends AbsProductFactory{
    // Constructor for the product
    public ProductCFactory(){

        this.name = "Product C";
    }
    // method inherited from the AbsProductFactory to create a product
    @Override
    public Product createProduct() {
        return new ProductC(price);
    }
}
