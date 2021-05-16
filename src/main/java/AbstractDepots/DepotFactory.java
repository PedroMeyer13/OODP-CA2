package AbstractDepots;

import AbstractProducts.AbsProductFactory;
import AbstractProducts.ProductFactory;
import Model.Depot;
import Model.Product;

public class DepotFactory {

    // creating private instance of the class
    private static DepotFactory instance = new DepotFactory();

    // private constructor that will return a product created by the abstract factory
    private Depot DepotFactory(AbsDepotFactory factory){
        return factory.createDepot();
    }

    // public method to return a instance of this class
    public static DepotFactory getInstance(){
        if (instance == null){
            synchronized (ProductFactory.class){
                if (instance == null){
                    instance = new DepotFactory();
                }
            }
        }
        return instance;
    }

    // public instance to return the private constructor
    public Depot getDepotFactory(AbsDepotFactory factory) {
        return  DepotFactory(factory);
    }
}
