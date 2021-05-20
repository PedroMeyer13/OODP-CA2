package Trading;

import Model.Companies;
import Model.TradeInfo;
import MyDepots.Depots;

// this class is used to perform the transactions
public class Trading {

    private Depots buyer = null;
    private Depots seller = null;
    private int buyerControl;
    private int sellerControl;
    private int buyerDepot;
    private int sellerDepot;

    // this method performs the transactions and saves into the depots
    public Companies[] startTrading(Companies[] companies) {

        // loop that stops when all the available depots cannot trade anymore
        while ((setTrade(companies))) {
                // check if the buyer has enough money to buy the product
            if (companies[buyerControl].getDepot(buyerDepot).getAllowance() > (companies[sellerControl].getDepot(sellerDepot).getPrice() + companies[sellerControl].getDepot(sellerDepot).getDeliveryPrice())) {

                // add a new transaction to the buyer's record
                buyer.getTrade().add(newTransaction(buyer.getName(), "Buy", seller.getName(), seller.getNativeProduct().getName(), seller.getPrice() + seller.getDeliveryPrice()));
                // add a new transaction to the seller record
                seller.getTrade().add(newTransaction(seller.getName(), "Sell", buyer.getName(), seller.getNativeProduct().getName(), seller.getPrice() + seller.getDeliveryPrice()));

                // update the fields of the buyer and seller
                updateFields(companies[buyerControl], companies[sellerControl]);
            }
        }
        // return the companies after the trade was done
        return companies;
    }

    // this method checks if any of the companies have depots available for the transaction
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

    // this method will control if a company can trade
    private String isTradable(Companies[] companies) {
        //
        if (CanTrade(companies)) {
            return "true";
        }
        return "false";
    }

    // this gets two companies and check if they have enough space to buy and sell
    public boolean CanTrade(Companies[] companies) {

        // do while loop to get two different companies
        do {
            buyerControl = getRandomNumber(0, 2);
            sellerControl = getRandomNumber(0, 2);
            // keep going while the companies are the same
        } while (buyerControl == sellerControl);

        // get a random depot
        buyerDepot = getRandomNumber(1, companies[buyerControl].getCanBuy().size());
        buyer = companies[buyerControl].getDepot(buyerDepot);

        // gets a random seller
        sellerDepot = getRandomNumber(1, companies[buyerControl].getCanBuy().size());
        seller = companies[sellerControl].getDepot(sellerDepot);

        // checks if they have enough space to buy and sell the products
        if ((buyer.getExternalProduct() > 39) || (seller.getNativeStock() < 14)) {
            return false;
        }
        return true;
    }

    // method that creates a new transaction object that will be stored in the depots
    public TradeInfo newTransaction(String company, String transactionType, String client, String product, int total) {
        TradeInfo trade = new TradeInfo.TradeInfoBuilder(
                company,
                transactionType,
                client
        ).setProduct(product).setTotal(total).build();
        return trade;
    }

    // this method generates and returns a random number
    private int getRandomNumber(int min, int max) {
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }

    // this method updates the information of the depots after a transaction
    private void updateFields(Companies companyBuyer, Companies companySeller) {

        // add a new external product to the buyer
        buyer.setExternalProduct(buyer.getExternalProduct() + 1);

        // if the buyer has more than 39 external products it removes them from the available depots to make transactions
        if (buyer.getExternalProduct() > 39) {
            companyBuyer.removeItemCanBuy(buyerDepot);
        }
        // set the seller stock to match the sold stock
        seller.setNativeStock(seller.getNativeStock() - 1);
        // add money from the cash balance after the transaction
        seller.setCashBalance(seller.getPrice() + seller.getDeliveryPrice());

        // if the depot cant sell anymore, removes them from the available depots for transaction
        if (buyer.getNativeStock() < 16) {
            companySeller.removeItemCanBuy(sellerDepot);
        }
    }
}