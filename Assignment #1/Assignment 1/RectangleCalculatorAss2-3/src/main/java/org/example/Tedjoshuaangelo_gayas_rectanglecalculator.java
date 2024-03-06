package org.example;

import java.util.Scanner;

public class Tedjoshuaangelo_gayas_rectanglecalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Area and Perimeter Calculator");

        while (true) {
            double length = getDoubleWithRangeValidation(scanner, "Enter Length: ", 0.0, 1000000.0);
            double width = getDoubleWithRangeValidation(scanner, "Enter Width: ", 0.0, 1000000.0);

            double area = width * length;
            double perimeter = 2 * width + 2 * length;

            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);

            String repeat = getStringWithValidation(scanner, "Continue? (y/n)");

            if (!repeat.equals("y")) {
                System.out.println("Exiting.");
                break;
            }
        }
        scanner.close();
    }

    public static double getDoubleWithRangeValidation(Scanner scanner, String prompt, double min, double max) {
        double value;
        while (true) {
            try {
                System.out.print(prompt);
                value = scanner.nextDouble();

                if (value <= min || value >= max) {
                    System.out.println("Error! Number must be greater than " + min + " and less than " + max + ".");
                    continue;
                }

                break;
            } catch (Exception e) {
                System.out.println("Error! Invalid decimal value. Try again.");
                scanner.nextLine();
            }
        }
        return value;
    }

    public static String getStringWithValidation(Scanner scanner, String prompt) {
        String value;
        while (true) {
            try {
                System.out.print(prompt);
                value = scanner.next();

                if (value.isEmpty()) {
                    System.out.println("Error! This entry is required. Try again.");
                    continue;
                }

                if (!value.toLowerCase().equals("y") && !value.toLowerCase().equals("n")) {
                    System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
                    continue;
                }

                break;
            } catch (Exception e) {
                System.out.println("Error! Invalid input. Try again.");
                scanner.nextLine();
            }
        }
        return value.toLowerCase();
    }
}
