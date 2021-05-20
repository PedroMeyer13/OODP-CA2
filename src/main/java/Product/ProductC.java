package Product;

import Model.Product;

// this is the class that creates Product A
public class ProductC extends Product {

    // constructor for the product
    public ProductC() {
        this.name = "Product C";
    }

    // Display the object in a better format for the user
    @Override
    public String toString() {
        return "Product name: " + getName();
    }
}
