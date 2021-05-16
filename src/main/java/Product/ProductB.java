package Product;

import Model.Product;

public class ProductB extends Product {

    public ProductB(int price, String name){
        this.ID = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product Name: " + getName() + ", Price: " + getID() ;
    }

}
