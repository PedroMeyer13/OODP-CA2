package AbstractProducts;

import Model.Product;

public class ProductFactory {
    // creating private instance of the class
    private static ProductFactory instance = new ProductFactory();

    // private constructor that will return a product created by the abstract factory
    private Product ProductFactory(AbsProductFactory factory){
        return factory.createProduct();
    }

    // public method to return a instance of this class
    public static ProductFactory getInstance(){
        if (instance == null){
            synchronized (ProductFactory.class){
                if (instance == null){
                    instance = new ProductFactory();
                }
            }
        }
        return instance;
    }

    // public instance to return the private constructor
    public Product getProductFactory(AbsProductFactory factory) {
        return ProductFactory(factory);
    }
}
