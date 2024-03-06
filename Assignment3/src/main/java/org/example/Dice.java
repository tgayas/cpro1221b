import java.util.Scanner;


// Dice class represents a pair of dice with methods for rolling, getting values, and printing results
public class Dice {
    private Die die1;
    private Die die2;


    // Constructor to create a pair of dice
    public Dice() {
        die1 = new Die();
        die2 = new Die();
    }

    public int getDie1Value() {
        return die1.getValue();
    } // Method to get the value of the first die

    public int getDie2Value() {
        return die2.getValue();
    }     // Method to get the value of the second die


    public int getSum() {
        return die1.getValue() + die2.getValue();
    }     // Method to get the sum of both dice

    public void roll() { // Method to roll both dice
        die1.roll();
        die2.roll();
    }

    public void printRoll() { // Method to print the results of the dice roll and check for special cases
        int sum = getSum();

        System.out.println("Dice 1: " + die1.getValue());
        System.out.println("Dice 2: " + die2.getValue());
        System.out.println("Total: " + sum);

        // Check for special cases: craps, snake eyes, and boxcars

        if (sum == 7) {
            System.out.println("Craps!");
        } else if (die1.getValue() == 1 && die2.getValue() == 1) {
            System.out.println("Snake eyes!");
        } else if (die1.getValue() == 6 && die2.getValue() == 6) {
            System.out.println("Boxcars!");
        }
    }
}
