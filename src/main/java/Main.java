import Generators.DepotGenerator;
import Generators.ProductGenerator;
import Model.Depot;
import Model.Product;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ProductGenerator product = new ProductGenerator();
//        ArrayList<Product> generated = product.productGenerator("Product A", 10);

        DepotGenerator depots = new DepotGenerator();
        ArrayList<Depot> depotGenerated = depots.DepotGenerator("Product A", 2);
        System.out.println(depotGenerated.get(0).getExternalProduct1().get(0));
    }
}