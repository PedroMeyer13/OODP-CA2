package Companies;

import AbstractProducts.ProductAFactory;
import AbstractProducts.ProductFactory;
import Model.Product;
import MyDepots.Depots;

public class CompanyA extends Companies{

    public CompanyA(String companyNameA) {

        this.companyName = companyNameA;
        Product productA = ProductFactory.getInstance().getProductFactory(new ProductAFactory());
        for (int i =  0; i <= 49; i++){
           depot.add(new Depots("A"+(i + 1), productA));
           this.setCanBuy(i);
           this.buyList.add(i);
        }
    }

    @Override
    public String toString() {
        return "Company Name:  "+ getCompanyName();
    }
}
