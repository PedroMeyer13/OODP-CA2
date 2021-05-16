package Model;

// Generic Product. Everything related to a product is here
public abstract class Product {

    // Common attributes for all products
    protected int ID;
    protected String name;

    // setters and getter for all the parameters above
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
