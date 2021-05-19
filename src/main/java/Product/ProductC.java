package Product;

import Model.Product;

public class ProductC extends Product {

    public ProductC(){
        this.name = "Product C";
    }

    @Override
    public String toString() {
        return "Product name: " + getName() ;
    }
}
