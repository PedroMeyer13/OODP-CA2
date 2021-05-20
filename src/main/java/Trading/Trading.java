package Trading;

import Companies.Companies;
import Model.Tradeinfo;
import MyDepots.Depots;

import java.util.ArrayList;

public class Trading {

    private Depots buyer = null;
    private Depots seller = null;
    private ArrayList<Tradeinfo> tradeList = new ArrayList<>();
    private int i;
    private int j;
    private int k;
    private int l;
    private int f = 0;
    private String goLoop = "true";

    public Companies[] startTrading(Companies[] companies) {

        while ((setTrade(companies))) {

            if (companies[i].getDepot(k).getAllowance() > (companies[j].getDepot(l).getPrice() + companies[j].getDepot(l).getDeliveryPrice())) {
                buyer.getTrade().add(newTransaction(buyer.getName(), "Buy", seller.getName(), seller.getNativeProduct().getName(), seller.getPrice() + seller.getDeliveryPrice()));
                seller.getTrade().add(newTransaction(seller.getName(), "Sell", buyer.getName(), seller.getNativeProduct().getName(), seller.getPrice() + seller.getDeliveryPrice()));
                updateFields(companies[i], companies[j]);
                System.out.println(buyer.getTrade());

            }

        }

        return companies;
    }

    private boolean setTrade(Companies[] companies) {
        int size = 20;
        if ((companies[0].getCanBuy().size() < size) && (companies[1].getCanBuy().size() < size)) {
            return false;
        }
        if ((companies[0].getCanBuy().size() < size) && (companies[2].getCanBuy().size() < size)) {
            return false;
        }
        if ((companies[2].getCanBuy().size() < size) && (companies[1].getCanBuy().size() < size)) {
            return false;
        }
        while (isTradable(companies) != "true") {
            isTradable(companies);
        }
        return true;
    }

    private String isTradable(Companies[] companies) {
        //  System.out.print("B: " + companies[0].getCanBuy().size() + " C: " + companies[1].getCanBuy().size() + " A:"+ companies[2].getCanBuy().size());

        if (CanTrade(companies)) {
            return "true";
        }
        return "false";
    }

    public boolean CanTrade(Companies[] companies) {

        do {
            i = getRandomNumber(0, 2);
            j = getRandomNumber(0, 2);
        } while (i == j);

        k = getRandomNumber(1, companies[i].getCanBuy().size());
        buyer = companies[i].getDepot(k);
        l = getRandomNumber(1, companies[i].getCanBuy().size());
        seller = companies[j].getDepot(l);

        if ((buyer.getExternalProduct() > 39) || (seller.getNativeStock() < 14)) {
            return false;

        }
        return true;
    }

    public Tradeinfo newTransaction(String company, String transactionType, String client, String product, int total) {

        Tradeinfo trade = new Tradeinfo(
                company,
                transactionType,
                client,
                product,
                total
        );
        return trade;
    }

    private int getRandomNumber(int min, int max) {
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }

    private void updateFields(Companies companyBuyer, Companies companySeller) {
//        System.out.println(buyer.getExternalProduct());
        buyer.setExternalProduct(buyer.getExternalProduct() + 1);
        if (buyer.getExternalProduct() > 39) {
            companyBuyer.removeItemCanBuy(k);
        }
        seller.setNativeStock(seller.getNativeStock() - 1);
        seller.setCashBalance(seller.getPrice() + seller.getDeliveryPrice());
        if (buyer.getNativeStock() < 16) {
            companySeller.removeItemCanBuy(l);
        }
    }
}