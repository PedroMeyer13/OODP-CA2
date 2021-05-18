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
    private int balance;


    public void startTrading(Companies[] companies){
        buyer = companies[0];
        try {
            for (int i=0; i <= buyer.getDepot().size()-1; i++){
                buyer.getDepot().get(i);
                seller = companies[getRandomNumber(1,2)];

                for(int j = 0; j<=0; j++){
                    sellerNative = seller.getDepot().get(j).getNativeStock();
                    System.out.println(sellerNative);
                    sellerPrice = seller.getDepot().get(i).getDeliveryPrice() + seller.getDepot().get(i).getNativeProduct().getPrice();
                    buyerExternal = buyer.getDepot().get(i).getExternalProduct();
                    allowance = buyer.getDepot().get(i).getAllowance();
                    product = seller.getDepot().get(j).getNativeProduct().getName();
                    balance = 0;
                }
                    if (buyerConditions(buyerExternal,allowance,sellerPrice)){
                    }
                    if (sellerConditions(sellerNative)){
                        System.out.println("here");
                        buyer.getTrade().add(newTrasaction(buyer.getCompanyName(), "Buy", seller.getCompanyName(), product, sellerPrice));
                    }
                }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(buyer.getTrade());
    }

    public Boolean sellerConditions(int sellerNative){

        if (sellerNative > 15){
            return checks = true;
        }
        return checks = false;
    }

    public Boolean buyerConditions(int buyerExternal, int allowance, int sellerPrice){
        if(allowance < sellerPrice || buyerExternal < 40 ){
            return checks = true;
        }
        return checks = false;
    }

    public Tradeinfo newTrasaction(String company, String transactionType, String client, String product, int total){

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