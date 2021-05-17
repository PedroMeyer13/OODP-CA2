package Product;

import Model.Product;

public class ProductB extends Product {

    public ProductB(int price){
        this.ID = price;
        this.name = "Product B";
    }

    @Override
    public String toString() {
        return "Product Name: " + getName() + ", Price: " + getID() ;
    }

}
