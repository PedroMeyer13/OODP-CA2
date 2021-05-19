package Companies;

import Model.Tradeinfo;
import MyDepots.Depots;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Companies {

    protected ArrayList<Integer> buyList = new ArrayList<>();
    protected Set<Integer> canBuy = new HashSet<>();
    protected ArrayList<Tradeinfo> trade = new ArrayList<>();
    protected ArrayList<Depots> depot = new ArrayList<>();
    protected String companyName;


    public ArrayList<Integer> getBuyList() {
        return buyList;
    }

    public void setBuyList(ArrayList<Integer> buyList) {
        this.buyList = buyList;
    }

    public void setTrade(ArrayList<Tradeinfo> trade) {
        this.trade = trade;
    }

    public Depots getDepot(int randomNumber) {
        return depot.get(randomNumber);
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