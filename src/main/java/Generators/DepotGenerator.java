package Generators;

import AbstractDepots.DepotAFactory;
import AbstractDepots.DepotFactory;
import Model.Depot;


import java.util.ArrayList;

public class DepotGenerator {

    private ArrayList<Depot> depots =  new ArrayList<Depot>();
    private ProductGenerator product = new ProductGenerator();

    public ArrayList<Depot> DepotGenerator( String name, int quantity){

        for (int i = 1; i <= quantity; i++){
            Depot depot = DepotFactory.getInstance().getDepotFactory(
                    new DepotAFactory(null,
                            null,
                            null,
                            "Pedro",10,
                            100,
                            25,
                            0));
            depots.add(depot);
        }
        return depots;
    }

    private int getRandomNumber(int min, int max){
        int random_int = (int)Math.floor(Math.random()*(max-min+1) + min);
        return random_int;
    }
}
