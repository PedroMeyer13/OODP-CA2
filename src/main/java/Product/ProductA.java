package Product;

import Model.Product;

// this is the class that creates Product A
public class ProductA extends Product {

    // constructor for the product
    public ProductA(){
        this.name = "Product A";
    }

    // Display the object in a better format for the user
    @Override
    public String toString() {
        return "Product name: " + getName();
    }

}
