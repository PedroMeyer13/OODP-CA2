package AbstractProducts;


import Model.Product;
import Product.*;
// class that will create the Product B
public class ProductBFactory extends AbsProductFactory{

    // Constructor for the product
    public ProductBFactory(){
//        this.price = price;
        this.name = "Product B";
    }
    // method inherited from the AbsProductFactory to create a product
    @Override
    public Product createProduct() {
        return new ProductB(price);
    }
}
