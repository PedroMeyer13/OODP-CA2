import Companies.CompanyA;
import Companies.CompanyB;
import Companies.CompanyC;

public class Main {

    public static void main(String[] args) {
        CompanyA companyA = new CompanyA("Company A");
        System.out.println(companyA);

        CompanyB companyB = new CompanyB("Company B");
        System.out.println(companyB);

        CompanyC companyC = new CompanyC("Company C");
        System.out.println(companyC);

    }
}