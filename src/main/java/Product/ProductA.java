package Product;

import Model.Product;

public class ProductA extends Product {

    public ProductA(int price){
        this.price = price;
        this.name = "Product A";
    }

    @Override
    public String toString() {
        return "Product name: " + getName() + ", Product price: " + getPrice() ;
    }

}
