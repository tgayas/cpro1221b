import java.util.Scanner;

// DiceRollerApp class contains the main method for running the Dice Roller application
public class DiceRollerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dice Roller App");


        // Loop to allow the user to roll the dice multiple times
        do {
            Dice dice = new Dice();
            dice.roll();
            dice.printRoll();

            // Ask the user if they want to roll again
            System.out.print("\nRoll again? (y/n): ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));

        System.out.println("Goodbye! Thanks for Playing!");

        scanner.close();
    }
}
