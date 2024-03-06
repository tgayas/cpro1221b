package org.example;

// A class representing a circle, inheriting from the Shape class
public class Circle extends Shape {
    private double radius; // Radius of the circle

    // Constructor to initialize the circle with a given radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for the radius
    public double getRadius() {
        return radius;
    }

    // Setter method to update the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
