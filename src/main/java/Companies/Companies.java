package Companies;

import Model.Tradeinfo;
import MyDepots.Depots;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Companies {

 Set<Integer> canBuy = new HashSet<>();
    ArrayList<Tradeinfo> trade = new ArrayList<>();
    ArrayList<Depots> depot = new ArrayList<>();
    String companyName;


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