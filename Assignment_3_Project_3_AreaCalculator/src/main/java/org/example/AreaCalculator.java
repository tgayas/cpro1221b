package org.example;
import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Area Calculator"); // Greeting the user

        char choice; // Variable to store the user's shape choice

        // Loop to keep asking for shapes until the user decides to stop
        do {
            // Asking the user to choose a shape (c for circle, s for square, r for rectangle)
            System.out.print("\nCalculate area of a circle, square, or rectangle? (c/s/r): ");
            choice = scanner.next().charAt(0); // Reading the first character of user input

            // Deciding which shape to calculate based on the user's choice
            switch (choice) {
                case 'c':
                    calculateCircleArea(scanner); // Calculate and display the area of a circle
                    break;
                case 's':
                    calculateSquareArea(scanner); // Calculate and display the area of a square
                    break;
                case 'r':
                    calculateRectangleArea(scanner); // Calculate and display the area of a rectangle
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 'c', 's', or 'r'."); // Error message for invalid input
            }

            // Asking the user if they want to continue
            System.out.print("\nContinue? (y/n): ");
        } while (scanner.next().charAt(0) == 'y'); // Loop continues if the user enters 'y'

        System.out.println("Goodbye!"); // Displaying a goodbye message when the user decides to exit
        scanner.close(); // Closing the scanner to free up resources
    }

    // Method to calculate and display the area of a circle
    private static void calculateCircleArea(Scanner scanner) {
        System.out.println("\nCIRCLE:"); // Displaying a message for circle calculation

        System.out.print("Enter radius: "); // Asking the user to enter the radius
        double radius = scanner.nextDouble(); // Reading the radius from the user

        // Calculating the area of the circle using the formula
        double area = Math.PI * Math.pow(radius, 2);

        // Displaying the calculated area
        System.out.println("Area: " + area);
    }

    // Method to calculate and display the area of a square
    private static void calculateSquareArea(Scanner scanner) {
        System.out.println("\nSQUARE:"); // Displaying a message for square calculation

        System.out.print("Enter width: "); // Asking the user to enter the width
        double width = scanner.nextDouble(); // Reading the width from the user

        // Calculating the area of the square using the formula
        double area = Math.pow(width, 2);

        // Displaying the calculated area
        System.out.println("Area: " + area);
    }

    // Method to calculate and display the area of a rectangle
    private static void calculateRectangleArea(Scanner scanner) {
        System.out.println("\nRECTANGLE:"); // Displaying a message for rectangle calculation

        System.out.print("Enter width: "); // Asking the user to enter the width
        double width = scanner.nextDouble(); // Reading the width from the user

        System.out.print("Enter height: "); // Asking the user to enter the height
        double height = scanner.nextDouble(); // Reading the height from the user

        // Calculating the area of the rectangle using the formula
        double area = width * height;

        // Displaying the calculated area
        System.out.println("Area: " + area);
    }
}
