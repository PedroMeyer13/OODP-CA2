package Companies;

import AbstractProducts.ProductAFactory;
import AbstractProducts.ProductFactory;
import Model.Companies;
import Model.Product;
import Model.Depots;

// this class will create a company A
public class CompanyA extends Companies {

    // constructor used to create a company
    public CompanyA(String companyNameA) {
        this.companyName = companyNameA;
        Product productA = ProductFactory.getInstance().getProductFactory(new ProductAFactory());
        for (int i =  1; i <= 50; i++){
           depot.add(new Depots("A"+(i), productA));
           this.setCanBuy(i);
        }
    }

    // defining how the object will be displayed.
    @Override
    public String toString() {
        return "Company Name:  "+ getCompanyName();
    }
}
