package Trading;

import Model.Companies;
import Model.TradeInfo;
import MyDepots.Depots;

// this class is used to perform the transactions
public class Trading {

    private Depots buyer = null;
    private Depots seller = null;
    private int buyerControl;
    private int buyerDepot;
    private int sellerControl;
    private int sellerDepot;

    // this method performs the transactions and saves into the depots
    public Companies[] startTrading(Companies[] companies) {

        // loop that stops when all the available depots cannot trade anymore
        while ((setTrade(companies))) {
                // check if the buyer has enough money to buy the product
            if (companies[buyerControl].getDepot(sellerControl).getAllowance() > (companies[buyerDepot].getDepot(sellerDepot).getPrice() + companies[buyerDepot].getDepot(sellerDepot).getDeliveryPrice())) {

                // add a new transaction to the buyer's record
                buyer.getTrade().add(newTransaction(buyer.getName(), "Buy", seller.getName(), seller.getNativeProduct().getName(), seller.getPrice() + seller.getDeliveryPrice()));
                // add a new transaction to the seller record
                seller.getTrade().add(newTransaction(seller.getName(), "Sell", buyer.getName(), seller.getNativeProduct().getName(), seller.getPrice() + seller.getDeliveryPrice()));

                // update the fields of the buyer and seller
                updateFields(companies[buyerControl], companies[buyerDepot]);
            }
        }
        // return the companies after the trade was done
        return companies;
    }

    // this method checks if any of the depots have space available to buy
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
        if (CanTrade(companies)) {
            return "true";
        }
        return "false";
    }

    public boolean CanTrade(Companies[] companies) {

        do {
            buyerControl = getRandomNumber(0, 2);
            buyerDepot = getRandomNumber(0, 2);
        } while (buyerControl == buyerDepot);

        sellerControl = getRandomNumber(1, companies[buyerControl].getCanBuy().size());
        buyer = companies[buyerControl].getDepot(sellerControl);
        sellerDepot = getRandomNumber(1, companies[buyerControl].getCanBuy().size());
        seller = companies[buyerDepot].getDepot(sellerDepot);

        if ((buyer.getExternalProduct() > 39) || (seller.getNativeStock() < 14)) {
            return false;
        }
        return true;
    }

    public TradeInfo newTransaction(String company, String transactionType, String client, String product, int total) {

        TradeInfo trade = new TradeInfo.TradeInfoBuilder(
                company,
                transactionType,
                client
        ).setProduct(product).setTotal(total).build();
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
            companyBuyer.removeItemCanBuy(sellerControl);
        }
        seller.setNativeStock(seller.getNativeStock() - 1);
        seller.setCashBalance(seller.getPrice() + seller.getDeliveryPrice());
        if (buyer.getNativeStock() < 16) {
            companySeller.removeItemCanBuy(sellerDepot);
        }
    }
}