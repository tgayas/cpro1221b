package org.example;

// A class representing a square, inheriting from the Shape class
public class Square extends Shape {
    private double width; // Width of the square

    // Constructor to initialize the square with a given width
    public Square(double width) {
        this.width = width;
    }

    // Getter method for the width
    public double getWidth() {
        return width;
    }

    // Setter method to update the width
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate the area of the square
    @Override
    public double getArea() {
        return Math.pow(width, 2);
    }
}
