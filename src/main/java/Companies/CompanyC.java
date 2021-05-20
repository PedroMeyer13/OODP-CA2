package Companies;

import AbstractProducts.ProductCFactory;
import AbstractProducts.ProductFactory;
import Model.Companies;
import Model.Product;
import Model.Depots;

// this class will create a company C
public class CompanyC extends Companies {

    // constructor used to create a company
    public CompanyC(String companyNameC) {
        this.companyName = companyNameC;
        Product productC = ProductFactory.getInstance().getProductFactory(new ProductCFactory());
        for (int i = 1; i <= 50; i++) {
            depot.add(new Depots("C" + (i), productC));
            this.setCanBuy(i);
        }
    }

    // defining how the object will be displayed.
    @Override
    public String toString() {
        return "Company Name:  " + getCompanyName();
    }


}
