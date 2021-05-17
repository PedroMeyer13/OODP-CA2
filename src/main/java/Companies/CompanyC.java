package Companies;

import Generators.DepotGenerator;


public class CompanyC extends Companies{

    public CompanyC(String companyNameC) {
        DepotGenerator depots = new DepotGenerator();
        this.depot = depots.DepotGenerator( 3,50);
        this.companyName = companyNameC;
    }

    @Override
    public String toString() {
        return "Company Name:  "+ getCompanyName() +" \nDepots " + getDepot() + "\n";
    }


}
