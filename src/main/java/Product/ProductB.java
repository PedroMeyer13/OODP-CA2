package Product;

import Model.Product;

public class ProductB extends Product {

    public ProductB(){

        this.name = "Product B";
    }

    @Override
    public String toString() {
        return "Product name: " + getName() ;
    }
}
