import java.util.Scanner;

public class mainMenu {

    private Scanner userInput = new Scanner(System.in);
    private int input;

    public void menu(){

        System.out.println("\nWhat operation would you like to perform?");
        System.out.println("1 - See All transactions");
        System.out.println("2 - See all transactions for a particular company");
        System.out.println("3 - Detailed information about a Company's Depots");
        System.out.println("4 - Exit");

        do {
            System.out.println("\nEnter  '1', '2', '3' or '4'");
            input = userInput.nextInt();

            switch (input)
            {
                case 1:
                    // do something
                    break;
                case 2:
                    // ..something else
                    break;
                case 3:
                    selectDepot();
                    break;
                case 4:
                    System.out.println("Thanks");
                    break;
                default:
                    System.out.println("You must to choose a value between 1 and 4.");
            }
        } while (input != 4);

    }

    private void selectDepot(){
        System.out.println("Which company would like to check");
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
