package DisplayTransactions;

import Model.Companies;
import Model.TradeInfo;
import SaveTradeInfo.SavingFile;

import java.util.ArrayList;

public class DisplayInfo {


    public static void AllTransactions(Companies[] companies) {
        for (Companies items : companies) {
            CompanyTransactions(items);
        }
    }

    public static void CompanyTransactions(Companies company) {
        ArrayList<String> out = new ArrayList<>();

        System.out.println("Company: " + company.getCompanyName());
        out.add(company.getCompanyName());
        for (int l = 1; l < 50; l++) {
            for (TradeInfo trade : company.getDepot(l).getTrade()) {
                System.out.println(trade.toString());
                out.add(trade.toString());
            }
        }
        new SavingFile().SavingTransactions(out, company.getCompanyName());
    }

    public static void CompanyDepots(Companies company) {
        ArrayList<String> out = new ArrayList<>();

        out.add(company.getCompanyName());
        for (int l = 1; l < 50; l++) {
            System.out.println(company.getDepot(l).toString());
            out.add(company.toString());
        }
    }

}