package Generators;

import AbstractProducts.*;
import Model.Product;

import java.util.ArrayList;

// this call creates products that will be allocated for depots
public class ProductGenerator {

    private ArrayList<Product> products =  new ArrayList<Product>();

    public ArrayList<Product> productGenerator(int type, String name, int quantity){

        for (int i = 1; i <= quantity; i++){
            Product product = ProductFactory.getInstance().getProductFactory((new ProductBFactory( getRandomNumber(100,1000), name + i)));
            products.add(product);
        }
        return products;
    }

    private int getRandomNumber(int min, int max){
        int random_int = (int)Math.floor(Math.random()*(max-min+1) + min);
        return random_int;
    }

}
