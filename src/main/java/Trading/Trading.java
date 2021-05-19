package Trading;

import Companies.Companies;
import Model.Tradeinfo;
import MyDepots.Depots;

import java.util.ArrayList;

public class Trading  {

    private Depots buyer = null;
    private Depots seller = null;
    private ArrayList<Tradeinfo> tradeList = new ArrayList<>();
    private boolean checks;
    private String product;
    private int sellerPrice;
    private int sellerNative;
    private int buyerExternal;
    private int allowance;
    private int i;
    private int j;

    public void startTrading(Companies[] companies) {
        while (isTradable(companies)) {
            CanTrade(companies);
            try {

//                for(int j = 0; j<=buyer.getDepot().size()-1; j++){
//                    int trader = getRandomNumber(0,49);
//                    sellerNative = seller.getDepot().get(trader).getNativeStock();
//                    sellerPrice = seller.getDepot().get(trader).getDeliveryPrice() + seller.getDepot().get(i).getNativeProduct().getPrice();
//                    buyerExternal = buyer.getDepot().get(i).getExternalProduct();
//                    allowance = buyer.getDepot().get(i).getAllowance();
//                    pro}
//                  duct = seller.getDepot().get(trader).getNativeProduct().getName();
//

                buyer.getTrade().add(newTransaction(companies[i].getCompanyName(), "Buy", companies[j].getCompanyName(), seller.getNativeProduct().getName(), seller.getNativeProduct().getPrice() + seller.getNativeProduct().getDelivery()));
                // buyer.getTrade().add(newTransaction(buyer.getCompanyName(), "Buy", seller.getCompanyName(), product, sellerPrice));
                seller.getTrade().add(newTransaction(companies[j].getCompanyName(), "Sell", companies[i].getCompanyName(), seller.getNativeProduct().getName(), seller.getNativeProduct().getPrice() + seller.getNativeProduct().getDelivery()));
                buyer.setAllowance(buyer.getAllowance() - seller.getNativeProduct().getPrice() + seller.getNativeProduct().getDelivery());
                seller.setCashBalance(seller.getNativeProduct().getPrice() + seller.getNativeProduct().getDelivery());


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(buyer.getTrade());
            System.out.println(seller.getTrade());
        }
    }
private boolean isTradable(Companies [] companies){
    for(Companies c: companies){
        for(int m=0; m<50; m++ )
           if( c.getCanBuy()[m]>0)
            return true;
        }
        return false;

}

public void CanTrade(Companies[] companies) {

    do {
        i = getRandomNumber(0, 2);
        j = getRandomNumber(0, 2);
    } while (i == j);

    int k = getRandomNumber(1, companies[i].getCanBuy().length);
    buyer = companies[i].getDepot(k);

    if (!canBuy(buyer.getExternalProduct(), buyer.getAllowance(), buyer.getNativeProduct().getPrice() + buyer.getNativeProduct().getDelivery())) {
        companies[i].removeItemCanBuy(k);
        CanTrade(companies);
        return;
    }
    k = getRandomNumber(1, companies[i].getCanBuy().length);
    seller = companies[j].getDepot(k);
        if (!sellerConditions(seller.getNativeStock())){
            companies[i].removeItemCanBuy(k);
            CanTrade(companies);
            return;
        }


}
    public Boolean sellerConditions(int sellerNative){

        if (sellerNative > 15){
            return checks = true;
        }
        return checks = false;
    }

    public Boolean canBuy(int buyerExternal, int allowance, int sellerPrice){
        if(allowance > sellerPrice && buyerExternal < 40 ){
            return checks = true;
        }
        return checks = false;
    }

    public Tradeinfo newTransaction(String company, String transactionType, String client, String product, int total){

        Tradeinfo trade = new Tradeinfo(
                company,
                transactionType,
                client,
                product,
                total
        );
        return trade;
    }

    private int getRandomNumber(int min, int max){
        int random_int = (int)Math.floor(Math.random()*(max-min+1) + min);
        return random_int;
    }
}