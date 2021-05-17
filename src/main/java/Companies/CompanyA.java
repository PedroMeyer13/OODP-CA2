package Companies;

import Generators.DepotGenerator;
import Model.Depot;
import MyDepots.DepotA;

import java.util.ArrayList;

public class CompanyA extends Companies{

    public CompanyA(String companyNameA) {
        DepotGenerator depots = new DepotGenerator();
        this.depot = depots.DepotGenerator(1, 50);;
        this.companyName = companyNameA;
    }

    @Override
    public String toString() {
        return "Company Name:  "+ getCompanyName() +" \nDepots " + getDepot() + "\n";
    }
}
