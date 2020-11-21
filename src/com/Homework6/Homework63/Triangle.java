package com.Homework6.Homework63;
//3
//Design a class named Triangle (Եռանկյուն)
//	properties
//	- sideA
//	- sideB
//	- sideC
//
//	methods
//	- calculatePerimeter
//	- calculateArea
public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;


    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }


}
