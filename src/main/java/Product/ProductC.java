package Product;

import Model.Product;

public class ProductC extends Product {

    public ProductC(int price){
        this.price = price;
        this.name = "Product A";
    }

    @Override
    public String toString() {
        return "Product name: " + getName() + ", Product price: " + getPrice() ;
    }
}
