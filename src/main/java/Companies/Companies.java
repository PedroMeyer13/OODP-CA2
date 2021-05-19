package Companies;

import Model.Tradeinfo;
import MyDepots.Depots;

import java.util.ArrayList;

// template of a Company
public abstract class Companies {

    // variables that every company should have
    protected int[]canBuy = new int[50];
    protected ArrayList<Tradeinfo> trade = new ArrayList<>();
    protected ArrayList<Depots> depot = new ArrayList<>();
    protected String companyName;

    // setters and getters of my variables
    public void setTrade(ArrayList<Tradeinfo> trade) {
        this.trade = trade;
    }

    public Depots getDepot(int randomNumber) {
        return depot.get(randomNumber-1);
    }

    public void setDepot(ArrayList<Depots> depot) {
        this.depot = depot;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int[] getCanBuy() {
        return canBuy;
    }

    public void setCanBuy(int i) {
        this.canBuy[i-1] = i;
    }

    public void removeItemCanBuy(int i) {
        this.canBuy[i-1] = -1;
    }
}