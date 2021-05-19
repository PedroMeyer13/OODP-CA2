package Companies;

import AbstractProducts.ProductBFactory;
import AbstractProducts.ProductFactory;
import Model.Product;
import MyDepots.Depots;


public class CompanyB extends Companies {


        public CompanyB(String companyNameB) {

            this.companyName = companyNameB;
            Product productB = ProductFactory.getInstance().getProductFactory(new ProductBFactory());
            for (int i =  1; i <= 50; i++){
                depot.add(new Depots("B"+(i), productB));
                this.setCanBuy(i);
            }
        }

    @Override
    public String toString() {
        return "Company Name:  "+ getCompanyName();
    }
}
