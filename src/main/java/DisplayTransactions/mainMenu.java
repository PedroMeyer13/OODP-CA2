package DisplayTransactions;

import Companies.CompanyA;
import Companies.CompanyB;
import Companies.CompanyC;
import Model.Companies;
import Trading.Trading;
import java.util.Scanner;

public class mainMenu {

    private Scanner userInput = new Scanner(System.in);
    private String input;
    private Companies[] companies = new Companies[3];
    private Trading trade = new Trading();

    public void menu() {

        companies[1] = new CompanyB("CompanyB");
        companies[2] = new CompanyC("CompanyC");
        companies[0] = new CompanyA("CompanyA");
        companies = trade.startTrading(companies);

        System.out.println("\nWhat operation would you like to perform?");
        System.out.println("1 - See All transactions");
        System.out.println("2 - See all transactions for a particular company");
        System.out.println("3 - Detailed information about a Company's Depots");
        System.out.println("4 - Exit");
        System.out.println("\nEnter  '1', '2', '3' or '4'");
        input = userInput.next().trim();

        switch (input) {
            case "1":
                DisplayInfo.AllTransactions(companies);
                menu();
                break;
            case "2":
                System.out.println("Which company would you like to check? ");
                System.out.println("1- Company A ");
                System.out.println("2- Company B ");
                System.out.println("3- Company C ");
                input = userInput.next();

                if (input.equals("1") || input.equals("2") || input.equals("3")) {
                    int option = Integer.parseInt(input) - 1;
                    DisplayInfo.CompanyTransactions(companies[option]);
                }
                menu();
                break;
            case "3":
                selectCompany();
                break;
            case "4":
                System.out.println("Thanks");
                System.exit(0);
                break;
            default:
                System.out.println("You must to choose a value between 1 and 4.");
                menu();
                break;
        }
    }

    private void selectCompany() {
        System.out.println("\nWhich company's depots would like to check");
        System.out.println("1 - Company A");
        System.out.println("2 - Company B");
        System.out.println("3 - Company C");
        System.out.println("4 - Back to the main menu");

        input = userInput.next();

        switch (input) {
            case "1":
                System.out.println("Company A");
                DisplayInfo.CompanyDepots(companies[0]);
                selectCompany();
                break;
            case "2":
                System.out.println("Company B");
                DisplayInfo.CompanyDepots(companies[1]);
                selectCompany();
                break;
            case "3":
                DisplayInfo.CompanyDepots(companies[2]);
                System.out.println("Company C");
                selectCompany();
                break;
            case "4":
                menu();
                break;
            default:
                System.out.println("You must to choose a value between 1 and 4.");
                selectCompany();
        }
    }
}

