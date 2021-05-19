import Companies.Companies;
import Companies.CompanyA;
import Companies.CompanyB;
import Companies.CompanyC;
import Trading.Trading;

public class Main {

    public static void main(String[] args) {

        //new mainMenu().menu();

        Companies[] companies = new Companies[3];
        Trading trade = new Trading();
        companies[0] = new CompanyB("CompanyB");
        companies[1] = new CompanyC("CompanyC");
        companies[2] = new CompanyA("CompanyA");
        System.out.println(companies[0].getBuyList());
        //trade.startTrading(companies);
        //   trade.startTrading(new CompanyA("Company A") ,companies);
        //System.out.println(companies[0].getDepot());
    }
}