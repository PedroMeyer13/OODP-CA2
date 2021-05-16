package Product;

import Model.Product;

public class ProductA extends Product {

    public ProductA(int price, String name){
        this.ID = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product Name: " + getName() + ", Product ID: " + getID() ;
    }

}
