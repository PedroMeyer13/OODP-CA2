package Product;

import Model.Product;

public class ProductC extends Product {

    public ProductC(int price, String name){
        this.ID = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product Name: " + getName() + ", Price: " + getID() ;
    }
}
