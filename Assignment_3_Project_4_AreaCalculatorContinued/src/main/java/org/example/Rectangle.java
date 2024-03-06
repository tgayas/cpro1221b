package org.example;

// A class representing a rectangle, inheriting from the Square class
public class Rectangle extends Square {
    private double height; // Height of the rectangle

    // Constructor to initialize the rectangle with a given width and height
    public Rectangle(double width, double height) {
        super(width); // Calling the constructor of the superclass (Square)
        this.height = height;
    }

    // Getter method for the height
    public double getHeight() {
        return height;
    }

    // Setter method to update the height
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    @Override
    public double getArea() {
        return getWidth() * height;
    }
}
