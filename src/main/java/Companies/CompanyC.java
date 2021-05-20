package Companies;

import AbstractProducts.ProductCFactory;
import AbstractProducts.ProductFactory;
import Model.Product;
import MyDepots.Depots;


public class CompanyC extends Companies{

        public CompanyC(String companyNameC) {

            this.companyName = companyNameC;
            Product productC = ProductFactory.getInstance().getProductFactory(new ProductCFactory());
            for (int i =  1; i <= 50; i++){
                depot.add(new Depots("C"+(i), productC));
                this.setCanBuy(i);
            }
        }


    @Override
    public String toString() {
        return "Company Name:  "+ getCompanyName();
    }


}
