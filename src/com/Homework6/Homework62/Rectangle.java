package com.Homework6.Homework62;

public class Rectangle {
    private double height;
    private double width;



    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    public double calculateArea() {
        return width * height;
    }

}
