package DisplayTransactions;

import Model.Companies;
import Model.TradeInfo;
import SaveTradeInfo.SavingFile;
import java.util.ArrayList;


// This class will format the output in a better way for the user.
public class DisplayInfo {

    // this class iterates over all the transitions and uses another method to output them
    public static void AllTransactions(Companies[] companies) {
        // loop over all the companies
        for (Companies items : companies) {
            CompanyTransactions(items);
        }
    }

    // Method that will output the info for the user
    public static void CompanyTransactions(Companies company) {
        // new array that will old all the strings for saving the in a file
        ArrayList<String> out = new ArrayList<>();

        // output the name of the company
        System.out.println("Company: " + company.getCompanyName());
        out.add(company.getCompanyName());
        // Loop over all the trades
        for (int l = 1; l < 50; l++) {
            for (TradeInfo trade : company.getDepot(l).getTrade()) {
                System.out.println(trade.toString());
                out.add(trade.toString());
            }
        }
        // cals the method to save the trades in a file
        new SavingFile().SavingTransactions(out, company.getCompanyName());
    }

    // Loop over the companies and return the depots info
    public static void CompanyDepots(Companies company) {
        // list to old all the depots info
        ArrayList<String> out = new ArrayList<>();

        out.add(company.getCompanyName());
        // Loop over the companies and get the info of the depots
        for (int l = 1; l < 50; l++) {
            System.out.println(company.getDepot(l).toString());
            out.add(company.toString());
        }
    }

}