package DisplayTransactions;

import Companies.CompanyA;
import Companies.CompanyB;
import Companies.CompanyC;
import Model.Companies;
import Trading.Trading;

import java.util.Scanner;

public class mainMenu {

    private Scanner userInput = new Scanner(System.in);
    private int input;
    private  Companies[] companies = new Companies[3];
    private  Trading trade = new Trading();

    public void menu(){

        companies[0] = new CompanyB("CompanyB");
        companies[1] = new CompanyC("CompanyC");
        companies[2] = new CompanyA("CompanyA");
        companies = trade.startTrading(companies);

        do {
            System.out.println("\nWhat operation would you like to perform?");
            System.out.println("1 - See All transactions");
            System.out.println("2 - See all transactions for a particular company");
            System.out.println("3 - Detailed information about a Company's Depots");
            System.out.println("4 - Exit");
            System.out.println("\nEnter  '1', '2', '3' or '4'");
            input = userInput.nextInt();

            switch (input)
            {
                case 1:
                    DisplayInfo.AllTransactions(companies);
                    break;
                case 2:
                    break;
                case 3:
                    selectCompany();
                    break;
                case 4:
                    System.out.println("Thanks");
                    break;
                default:
                    System.out.println("You must to choose a value between 1 and 4.");
            }
        } while (input != 4);

    }

    private void selectCompany(){
        System.out.println("Which company's depots would like to check");
        System.out.println("1 - Company A");
        System.out.println("2 - Company B");
        System.out.println("3 - Company C");
        System.out.println("4 - Back to the main menu");

        do {
            input = userInput.nextInt();

            switch (input)
            {
                case 1:
                    System.out.println("Company A");
                    break;
                case 2:
                    System.out.println("Company B");
                    break;
                case 3:
                    System.out.println("Company C");
                    break;
                case 4:
                    menu();
                    break;
                default:
                    System.out.println("You must to choose a value between 1 and 4.");
            }
        } while (input != 4);

    }

}
