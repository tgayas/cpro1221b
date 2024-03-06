package org.example;
import java.util.Scanner;


public class DiceRollerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dice Roller App");

        do {
            DiceRoller.rollDice();

            System.out.print("\nRoll again? (y/n): ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));

        System.out.println("Goodbye! Thanks for Playing!");

        scanner.close();
    }
}
