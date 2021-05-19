package AbstractProducts;

import Model.Product;
import Product.*;

// class that will create the Product A
public class ProductAFactory extends AbsProductFactory{

    // Constructor for the product
    public ProductAFactory(){
        this.name = "Product A";

    }
    // method inherited from the AbsProductFactory to create a product
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
