package org.example;
import java.util.Scanner;

public class Console {

    private static final Scanner sc = new Scanner(System.in);

    public void print(String message) {
        System.out.print(message);
    }

    public void println(String message) {
        System.out.println(message);
    }

    public String getString(String prompt) {
        print(prompt);
        return sc.nextLine();
    }

    public int getInt(String prompt) {
        while (true) {
            print(prompt);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e) {
                println("Error! Invalid integer value.");
            }
        }
    }

    public int getInt(String prompt, int min, int max) {
        while (true) {
            int value = getInt(prompt);
            if (value > min && value < max) {
                return value;
            } else {
                println("Error! Number must be greater than " + min + " and less than " + max + ".");
            }
        }
    }

    public double getDouble(String prompt) {
        while (true) {
            print(prompt);
            try {
                return Double.parseDouble(sc.nextLine());
            } catch(NumberFormatException e) {
                println("Error! Invalid integer value.");
            }
        }
    }

    public double getDouble(String prompt, double min, double max) {
        while (true) {
            double value = getDouble(prompt);
            if (value > min && value < max) {
                return value;
            } else {
                println("Error! Number must be greater than " + min + " and less than " + max + ".");
            }
        }
    }

    public char nextChar() {
        return sc.nextLine().charAt(0);
    }
}
