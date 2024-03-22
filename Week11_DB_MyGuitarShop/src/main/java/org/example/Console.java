package org.example;
import java.util.Scanner;

public class Console {

    private static final Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static int getInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Error! Invalid integer value.");
            }
        }
    }

    public static int getInt(String prompt, int min, int max) {
        while (true) {
            int value = getInt(prompt);
            if (value >= min && value <= max) { // Adjusted the condition to include min and max values
                return value;
            } else {
                System.out.println("Error! Number must be greater than or equal to " // Adjusted the error message
                        + min + " and less than or equal to " + max + ".");
            }
        }
    }

    public static double getDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Error! Invalid double value."); // Adjusted the error message
            }
        }
    }

    public static double getDouble(String prompt, double min, double max) {
        while (true) {
            double value = getDouble(prompt);
            if (value >= min && value <= max) { // Adjusted the condition to include min and max values
                return value;
            } else {
                System.out.println("Error! Number must be greater than or equal to "  // Adjusted the error message
                        + min + " and less than or equal to " + max + ".");
            }
        }
    }
}
