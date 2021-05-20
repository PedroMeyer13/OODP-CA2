import Model.Companies;
import Companies.CompanyA;
import Companies.CompanyB;
import Companies.CompanyC;
import SaveTradeInfo.SavingFile;
import Trading.Trading;

public class Main {

    public static void main(String[] args) {

        //new mainMenu().menu();

        Companies[] companies = new Companies[3];
        Trading trade = new Trading();
        companies[0] = new CompanyB("CompanyB");
        companies[1] = new CompanyC("CompanyC");
        companies[2] = new CompanyA("CompanyA");
        trade.startTrading(companies);
//        SavingFile.SavingTransactions(companies[0].getCompanyName(), "File");
    }
}