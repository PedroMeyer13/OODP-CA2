package Companies;

import AbstractProducts.ProductBFactory;
import AbstractProducts.ProductFactory;
import Model.Companies;
import Model.Product;
import MyDepots.Depots;

// this class will create a company B
public class CompanyB extends Companies {

    // constructor used to create a company
    public CompanyB(String companyNameB) {
        this.companyName = companyNameB;
        Product productB = ProductFactory.getInstance().getProductFactory(new ProductBFactory());
        for (int i = 1; i <= 50; i++) {
            depot.add(new Depots("B" + (i), productB));
            this.setCanBuy(i);
        }
    }

    // defining how the object will be displayed.
    @Override
    public String toString() {
        return "Company Name:  " + getCompanyName();
    }
}
