package com.Homework6.Homework63;

public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();
        triangle1.setSideA(2);
        triangle1.setSideB(3);
        triangle1.setSideC(4);

        System.out.println(triangle1.calculatePerimeter());
        System.out.println(triangle1.calculateArea());


    }

}
