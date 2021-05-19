//package Generators;
//
//import AbstractDepots.DepotAFactory;
//import AbstractDepots.DepotBFactory;
//import AbstractDepots.DepotCFactory;
//import AbstractDepots.DepotFactory;
//import AbstractProducts.*;
//import Model.Depot;
//
//
//import java.util.ArrayList;
//
//public class DepotGenerator {
//
//    private ArrayList<Depot> depots =  new ArrayList<Depot>();
//
//    public ArrayList<Depot> DepotGenerator( int option,int quantity){
//
//        if(option == 1){
//            for (int i = 1; i <= quantity; i++){
//                Depot depot = DepotFactory.getInstance().getDepotFactory(
//                        new DepotAFactory(ProductFactory.getInstance().getProductFactory(new ProductAFactory(getRandomNumber(1,10))),
//                                0,
//                                getRandomNumber(15,50),
//                                "Depot A" + i,
//                                getRandomNumber(50,100),
//                                getRandomNumber(1,10),
//                                0
//                        ));
//                depots.add(depot);
//            }
//        }else if(option == 2){
//            for (int i = 1; i <= quantity; i++){
//                Depot depot = DepotFactory.getInstance().getDepotFactory(
//                        new DepotBFactory(ProductFactory.getInstance().getProductFactory(new ProductBFactory(getRandomNumber(1,10))),
//                                0,
//                                getRandomNumber(15,50),
//                                "Depot B" + i,
//                                getRandomNumber(50,100),
//                                getRandomNumber(1,10),
//                                0
//                        ));
//                depots.add(depot);
//            }
//        }else {
//            System.out.println();
//            for (int i = 1; i <= quantity; i++){
//                Depot depot = DepotFactory.getInstance().getDepotFactory(
//                        new DepotCFactory(ProductFactory.getInstance().getProductFactory(new ProductCFactory(getRandomNumber(1,10))),
//                                0,
//                                getRandomNumber(15,40),
//                                "Depot C" + i,
//                                getRandomNumber(50,100),
//                                getRandomNumber(1,10),
//                                0
//                        ));
//                depots.add(depot);
//            }
//        }
//
//        return depots;
//    }
//
//
//}
