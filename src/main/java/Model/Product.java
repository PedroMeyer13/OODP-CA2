package Model;

// Generic Product. Everything related to a product is here
public abstract class Product {

    // Common attributes for all products
    protected int price;
    protected String name;

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    protected int delivery;


    // setters and getter for all the parameters above

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
