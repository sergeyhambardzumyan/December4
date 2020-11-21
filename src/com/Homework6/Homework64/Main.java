package com.Homework6.Homework64;

public class Main {
    public static void main(String[] args) {
    Point point1 = new Point();
    point1.setCoordinateX(10);
    point1.setCoordinateY(20);
        System.out.println(point1.distance());
        System.out.println(point1.distance(5, 10));
    }
}
