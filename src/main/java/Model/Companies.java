package Model;

import Model.TradeInfo;
import MyDepots.Depots;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// this class is a template for all the companies, containing common elements that all of the companies share.
public abstract class Companies {
    // variables that are common across all the companies
    protected Set<Integer> canBuy = new HashSet<>();
    protected ArrayList<TradeInfo> trade = new ArrayList<>();
    protected ArrayList<Depots> depot = new ArrayList<>();
    protected String companyName;

    // getters and setters for those variables
    public void setTrade(ArrayList<TradeInfo> trade) {
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

    public Set<Integer> getCanBuy() {
        return canBuy;
    }

    public void setCanBuy(int i) {

        this.canBuy.add(i-1);
    }

    public void removeItemCanBuy(int i) {
        this.canBuy.remove(i-1);
    }
}