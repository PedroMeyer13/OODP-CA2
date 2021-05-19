package Companies;

import AbstractProducts.ProductCFactory;
import AbstractProducts.ProductFactory;
import Model.Product;
import MyDepots.Depots;


public class CompanyC extends Companies{

        public CompanyC(String companyNameC) {

            this.companyName = companyNameC;
            Product productC = ProductFactory.getInstance().getProductFactory(new ProductCFactory());
            for (int i =  0; i <= 49; i++){
                depot.add(new Depots("C"+(i + 1), productC));
                this.setCanBuy(i);
                this.buyList.add(i);
            }
        }


    @Override
    public String toString() {
        return "Company Name:  "+ getCompanyName();
    }


}
