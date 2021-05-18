package Trading;

import Companies.Companies;
import Model.Tradeinfo;

import java.util.ArrayList;

public class Trading  {

    private Companies buyer = null;
    private Companies seller = null;
    private ArrayList<Tradeinfo> tradeList = new ArrayList<>();
    private boolean checks;
    private String product;
    private int sellerPrice;
    private int sellerNative;
    private int buyerExternal;
    private int allowance;


    public void startTrading(Companies buying,Companies[] companies){

        buyer = buying;

        try {
            for (int i=0; i <= buyer.getDepot().size()-1; i++){
                buyer.getDepot().get(i);
                seller = companies[getRandomNumber(0,1)];
                for(int j = 0; j<=0; j++){
                    sellerNative = seller.getDepot().get(j).getNativeStock();
                    sellerPrice = seller.getDepot().get(i).getDeliveryPrice() + seller.getDepot().get(i).getNativeProduct().getPrice();
                    buyerExternal = buyer.getDepot().get(i).getExternalProduct();
                    allowance = buyer.getDepot().get(i).getAllowance();
                    product = seller.getDepot().get(j).getNativeProduct().getName();
                    if (buyerConditions(buyerExternal,allowance,sellerPrice)){
                        System.out.println("Depot " + j);
                        break;
                    }
                    if (sellerConditions(sellerNative)){
                        buyer.getTrade().add(newTransaction(buyer.getCompanyName(), "Buy", seller.getCompanyName(), product, sellerPrice));
                        buyer.getDepot().get(j).setAllowance(allowance - sellerPrice);
                        seller.getDepot().get(j).setCashBalance(sellerPrice);
                    }
                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Boolean sellerConditions(int sellerNative){

        if (sellerNative > 15){
            return checks = true;
        }
        return checks = false;
    }

    public Boolean buyerConditions(int buyerExternal, int allowance, int sellerPrice){
        if(allowance > sellerPrice || buyerExternal < 40 ){
            return checks = false;
        }
        return checks = true;
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