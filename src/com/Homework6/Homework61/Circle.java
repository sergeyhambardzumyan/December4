package com.Homework6.Homework61;
//1
//Design a class named Circle
//	properties
//	- radius
//
//	methods
//	- calculatePerimeter
//	- calculateArea
public class Circle {

    private double radius;


    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
