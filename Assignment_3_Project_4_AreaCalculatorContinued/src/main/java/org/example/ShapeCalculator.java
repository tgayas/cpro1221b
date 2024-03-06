package org.example;

// A class to interact with the user and perform shape area calculations
public class ShapeCalculator {

    // Main method where the program starts
    public static void main(String[] args) {
        Console console = new Console(); // Creating a Console object for input/output

        console.println("Welcome to the Area Calculator"); // Greeting message to the user

        char choice;
        do {
            console.print("\nCalculate area of a circle, square, or rectangle? (c/s/r): ");
            choice = console.nextChar(); // Reading the user's choice

            switch (choice) {
                case 'c':
                    calculateCircleArea(console);
                    break;
                case 's':
                    calculateSquareArea(console);
                    break;
                case 'r':
                    calculateRectangleArea(console);
                    break;
                default:
                    console.println("Invalid choice. Please enter 'c', 's', or 'r'.");
            }

            console.print("\nContinue? (y/n): ");
        } while (console.nextChar() == 'y');

        console.println("Goodbye!"); // Farewell message
    }

    // Method to calculate and display the area of a circle
    private static void calculateCircleArea(Console console) {
        console.println("\nCIRCLE:");
        double radius = console.getDouble("Enter radius: ");
        Circle circle = new Circle(radius); // Creating a Circle object
        console.println(circle.toString()); // Displaying the area using the overridden toString method
    }

    // Method to calculate and display the area of a square
    private static void calculateSquareArea(Console console) {
        console.println("\nSQUARE:");
        double width = console.getDouble("Enter width: ");
        Square square = new Square(width); // Creating a Square object
        console.println(square.toString()); // Displaying the area using the overridden toString method
    }

    // Method to calculate and display the area of a rectangle
    private static void calculateRectangleArea(Console console) {
        console.println("\nRECTANGLE:");
        double width = console.getDouble("Enter width: ");
        double height = console.getDouble("Enter height: ");
        Rectangle rectangle = new Rectangle(width, height); // Creating a Rectangle object
        console.println(rectangle.toString()); // Displaying the area using the overridden toString method
    }
}
