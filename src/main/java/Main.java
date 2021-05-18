import Companies.Companies;
import Companies.CompanyA;
import Companies.CompanyB;
import Companies.CompanyC;
import Trading.Trading;

public class Main {

    public static void main(String[] args) {

        //new mainMenu().menu();

        Companies[] companies = new Companies[2];
        Trading trade = new Trading();
        companies[0] = new CompanyB("CompanyB");
        companies[1] = new CompanyC("CompanyC");
        trade.startTrading(new CompanyA("Company A") ,companies);
        //System.out.println(companies[0].getDepot());
    }
}