package AbstractProducts;

import Model.Product;
import Product.*;

// class that will create the Product A
public class ProductAFactory extends AbsProductFactory{

    // Constructor for the product
    public ProductAFactory(int price, String name){
        this.price = price;
        this.name = name;
    }
    // method inherited from the AbsProductFactory to create a product
    @Override
    public Product createProduct() {
        return new ProductA(price, name);
    }
}
