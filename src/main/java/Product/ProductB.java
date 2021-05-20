package Product;

import Model.Product;

// this is the class that creates Product B
public class ProductB extends Product {

    // constructor for the product
    public ProductB() {
        this.name = "Product B";
    }

    // Display the object in a better format for the user
    @Override
    public String toString() {
        return "Product name: " + getName();
    }
}
