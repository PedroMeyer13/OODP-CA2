package Trading;

import Companies.Companies;
import Companies.CompanyA;
import Companies.CompanyB;
import Companies.CompanyC;
import Model.Product;
import Model.Tradeinfo;

import java.util.ArrayList;

public class Trading  {

    private Companies buyer = null;
    private Companies seller1 = null;
    private Companies seller2 = null;
    private ArrayList<Tradeinfo> tradeList = new ArrayList<>();
    private Boolean checks;
    private int sellerPrice;
    private int sellerNative;
    private int buyerExternal;
    private int allowance;
    private int balance;


    public void startTrading(Companies[] companies){
        buyer = companies[0];
        seller1 = companies[1];
        seller2 = companies[2];

        try {
            for (int i=0; i <= buyer.getDepot().size(); i++){
                sellerNative = seller1.getDepot().get(i).getNativeStock();
                sellerPrice = seller1.getDepot().get(i).getDeliveryPrice();
                buyerExternal = buyer.getDepot().get(i).getExternalProduct();
                allowance = buyer.getDepot().get(i).getAllowance();
                balance = 0;

                if (buyerConditions(buyerExternal,allowance,sellerPrice)){
                    break;
                }

                if (sellerConditions(sellerNative)){

                }
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Boolean sellerConditions(int sellerNative){

        if (sellerNative < 15){
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

    public ArrayList<Tradeinfo> newTrasaction(String company, String transactionType, String client, String product, int total){

        Tradeinfo trade = new Tradeinfo(
                company,
                transactionType,
                client,
                product,
                total
        );
        tradeList.add(trade);

        return tradeList;
    }
}