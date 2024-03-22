package org.example;
import java.text.NumberFormat;

public class Product {

    private String code;
    private String name; // Change description to name to match the column name in the database
    private double listPrice; // Change price to listPrice to match the column name in the database

    public Product() {
        this("", "", 0);
    }

    public Product(String code, String name, double listPrice) { // Adjust constructor parameter names
        this.code = code;
        this.name = name;
        this.listPrice = listPrice;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) { // Adjust setter and getter method names
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setListPrice(double listPrice) { // Adjust setter and getter method names
        this.listPrice = listPrice;
    }

    public double getListPrice() {
        return listPrice;
    }

    public String getListPriceFormatted() { // Adjust method name
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(listPrice);
    }
}
