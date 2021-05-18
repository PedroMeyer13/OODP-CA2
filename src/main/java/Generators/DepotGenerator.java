package Generators;

import AbstractDepots.DepotAFactory;
import AbstractDepots.DepotFactory;
import AbstractProducts.*;
import Model.Depot;


import java.util.ArrayList;

public class DepotGenerator {

    private ArrayList<Depot> depots =  new ArrayList<Depot>();
    AbsProductFactory factory = null;

    public ArrayList<Depot> DepotGenerator( int option,int quantity){

        if(option == 1){
            factory = new ProductAFactory(getRandomNumber(1,10));
        }else if(option == 2){
            factory = new ProductBFactory(getRandomNumber(1,10));
        }else {
            factory = new ProductCFactory(getRandomNumber(1, 10));
        }
            for (int i = 1; i <= quantity; i++){
                Depot depot = DepotFactory.getInstance().getDepotFactory(
                        new DepotAFactory(ProductFactory.getInstance().getProductFactory(factory),
                                0,
                                getRandomNumber(15,50),
                                "Depot A" + i,
                                getRandomNumber(1,10),
                                getRandomNumber(1,10),
                                0
                        ));
                depots.add(depot);
            }
        return depots;
    }

    private int getRandomNumber(int min, int max){
        int random_int = (int)Math.floor(Math.random()*(max-min+1) + min);
        return random_int;
    }
}
