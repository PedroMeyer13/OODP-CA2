package Product;

import Model.Product;

public class ProductC extends Product {

    public ProductC(int price){
        this.ID = price;
        this.name = "Product C";
    }

    @Override
    public String toString() {
        return "Product Name: " + getName() + ", Price: " + getID() ;
    }
}
