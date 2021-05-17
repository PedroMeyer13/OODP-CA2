package Product;

import Model.Product;

public class ProductA extends Product {

    public ProductA(int price){
        this.ID = price;
        this.name = "Product A";
    }

    @Override
    public String toString() {
        return "Product Name: " + getName() + ", Product ID: " + getID() ;
    }

}
