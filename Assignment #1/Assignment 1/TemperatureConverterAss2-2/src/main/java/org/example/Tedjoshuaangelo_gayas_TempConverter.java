package org.example;
import java.util.Scanner;

        public class Tedjoshuaangelo_gayas_TempConverter {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                    while (true) {
                        System.out.println("1. Fahrenheit to Celsius");
                        System.out.println("2. Celsius to Fahrenheit");
                        System.out.print("Enter your choice (1 or 2): ");
                        int choice = scanner.nextInt();

                        if (choice == 1) {
                            System.out.print("Enter Fahrenheit: ");
                            double fahrenheit = scanner.nextDouble();
                            double celsius = (fahrenheit - 32) * 5.0 / 9.0;
                            System.out.printf("Celsius %.2f is %.2f in Fahrenheit%n", celsius, fahrenheit);

                        } else if (choice == 2) {
                            System.out.print("Enter Celsius: ");
                            double celsius = scanner.nextDouble();
                            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
                            System.out.printf("Fahrenheit %.2f is %.2f in Celsius%n", fahrenheit, celsius);

                        }

                        System.out.print("Another conversion? Y or N: ");
                        String repeat = scanner.next().toLowerCase();
                        if (!repeat.equals("y")) {
                            System.out.println("Application Closing");
                            break;
                        }

                    }
                    scanner.close();
                }
        }