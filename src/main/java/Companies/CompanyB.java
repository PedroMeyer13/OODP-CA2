package Companies;

import Generators.DepotGenerator;
import MyDepots.DepotB;

import java.util.ArrayList;

public class CompanyB extends Companies {

    public CompanyB(String companyNameB ) {
        DepotGenerator depots = new DepotGenerator();
        this.depot = depots.DepotGenerator( 2,50);
        this.companyName = companyNameB;
    }

    @Override
    public String toString() {
        return "Company Name:  "+ getCompanyName() +" \nDepots " + getDepot() + "\n";
    }
}
