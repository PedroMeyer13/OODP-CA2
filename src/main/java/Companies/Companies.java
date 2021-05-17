package Companies;

import Model.Depot;
import Model.Tradeinfo;

import java.util.ArrayList;

public abstract class Companies {

    ArrayList<Tradeinfo> trade = new ArrayList<>();
    ArrayList<Depot> depot = new ArrayList<Depot>();
    String companyName;

    public ArrayList<Tradeinfo> getTrade() {
        return trade;
    }

    public void setTrade(ArrayList<Tradeinfo> trade) {
        this.trade = trade;
    }

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
