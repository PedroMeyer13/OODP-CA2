import Companies.Companies;
import Companies.CompanyA;
import Companies.CompanyB;
import Companies.CompanyC;
import SaveTradeInfo.SavingFile;
import Trading.Trading;

public class Main {

    public static void main(String[] args) {

        Companies[] companies = new Companies[3];
        Trading trade = new Trading();
        companies[0] = new CompanyA("Company A");
        companies[1] = new CompanyB("CompanyB");
        companies[2] = new CompanyC("CompanyC");
        System.out.println(companies[0]);
        System.out.println(companies[1]);
        System.out.println(companies[0]);
        trade.startTrading(companies);
//        CompanyA companyA = new CompanyA("Company A");
//        System.out.println(companyA.getDepot().get(1));
//        int nativeStock = companyA.getDepot().get(1).getNativeStock();
//        companyA.getDepot().get(1).setNativeStock(nativeStock - 1);
//        System.out.println(companyA.getDepot().get(1));
    }
}