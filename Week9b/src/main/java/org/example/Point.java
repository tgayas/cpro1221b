package org.example;


@SuppressWarnings("ALL")
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // define getters
    public double getX()
    {
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    // define setters
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
}