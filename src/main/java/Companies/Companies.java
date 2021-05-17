package Companies;

import Model.Depot;

import java.util.ArrayList;

public abstract class Companies {

    ArrayList<Depot> depot = new ArrayList<Depot>();
    String companyName;

    public ArrayList<Depot> getDepot() {
        return depot;
    }

    public void setDepot(ArrayList<Depot> depot) {
        this.depot = depot;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
