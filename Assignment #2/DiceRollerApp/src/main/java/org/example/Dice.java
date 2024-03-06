package org.example;

public class Dice {
    public static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }
}
