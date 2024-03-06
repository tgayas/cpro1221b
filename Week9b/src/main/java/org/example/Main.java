package org.example;

public class Main {
    public static void main(String[] args) {
        // Instantiate the Point class
        Point p1 = new Point(7, 3);
        Object p2 = new Point(9, 1);

        printPoint(p1);
        printPoint((Point) p2); //Cast p2 to Point before calling printPoint
    }

    public static void printPoint(Object p) {
        if (p instanceof Point) {
            Point point = (Point) p;
            System.out.println("p =(" + point.getX() + "," + point.getY() + ")");
        } else {
            System.out.println("Invalid object type");
        }
    }
}
