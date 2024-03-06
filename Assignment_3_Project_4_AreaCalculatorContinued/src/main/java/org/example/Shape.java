package org.example;

// An abstract class representing a generic shape
public abstract class Shape {

    // An abstract method to calculate the area of a specific shape
    public abstract double getArea();

    // A default method that returns a string representation including the calculated area
    @Override
    public String toString() {
        return "Area: " + getArea();
    }
}
