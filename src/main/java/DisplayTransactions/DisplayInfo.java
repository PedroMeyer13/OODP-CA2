package DisplayTransactions;

import Model.Companies;
import Model.TradeInfo;

public class DisplayInfo {


    public static void AllTransactions(Companies[] companies) {
        String display = "Beginning \n";
        for (Companies items : companies) {
            for (int l = 1; l < 50; l++) {
                for (TradeInfo trade : items.getDepot(l).getTrade()) {
                    display += items.getDepot(l).getTrade();
                }
            }
        }
        System.out.println(display);
    }

    public static void CompanyTransactions(Companies companies) {

    }


}
