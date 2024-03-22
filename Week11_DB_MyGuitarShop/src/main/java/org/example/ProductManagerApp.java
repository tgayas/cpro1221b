package org.example;

import java.util.ArrayList;

public class ProductManagerApp {

    public static void main(String args[]) {
        System.out.println("Products by Category\n");

        boolean exit = false;
        while (!exit) {
            displayCategories();
            int categoryId = Console.getInt("Enter a category id (999 to exit): ");
            if (categoryId == 999) {
                exit = true;
            } else {
                displayProductsByCategory(categoryId);
            }
        }

        System.out.println("Bye!\n");
    }

    public static void displayCategories() {
        System.out.println("CATEGORIES");
        System.out.println("1 - Guitars");
        System.out.println("2 - Basses");
        System.out.println("3 - Drums\n");
    }

    public static void displayProductsByCategory(int categoryId) {
        String categoryName = getCategoryName(categoryId);
        if (categoryName != null) {
            System.out.println("\n" + categoryName.toUpperCase());
            System.out.printf("%-10s%-40s%-10s%n", "Code", "Name", "Price");
            System.out.println("-----------------------------------------------");

            ArrayList<Product> products = ProductDB.getProductsByCategory(categoryId);
            for (Product p : products) {
                System.out.printf("%-10s%-40s%-10s%n", p.getCode(), p.getName(), p.getListPriceFormatted());
            }
            System.out.println();
        } else {
            System.out.println("Invalid category id.\n");
        }
    }

    public static String getCategoryName(int categoryId) {
        switch (categoryId) {
            case 1:
                return "Guitars";
            case 2:
                return "Basses";
            case 3:
                return "Drums";
            default:
                return null;
        }
    }
}
