package Companies;

import AbstractProducts.ProductAFactory;
import AbstractProducts.ProductFactory;
import Model.Product;
import MyDepots.Depots;

public class CompanyA extends Companies{

    public CompanyA(String companyNameA) {

        this.companyName = companyNameA;
        Product productA = ProductFactory.getInstance().getProductFactory(new ProductAFactory());
        for (int i =  1; i <= 50; i++){
           depot.add(new Depots("A"+(i), productA));
           this.setCanBuy(i);
        }
    }

    @Override
    public String toString() {
        return "Company Name:  "+ getCompanyName();
    }
}
