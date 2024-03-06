package org.example;
public class DiceRoller {

    public static void rollDice() {
        int dice1 = Dice.rollDie();
        int dice2 = Dice.rollDie();
        int total = dice1 + dice2;

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        System.out.println("Total: " + total);

        if (total == 2) {
            System.out.println("Snake eyes!");
        } else if (total == 12) {
            System.out.println("Boxcars!");
        }
    }
}
