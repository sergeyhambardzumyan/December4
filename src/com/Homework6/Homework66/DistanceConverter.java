package com.Homework6.Homework66;
//6
//Design a class named DistanceConverter
//	methods
//	- convertMetersToMiles
//	- convertMilesToMeters
public class DistanceConverter {
    private double meters;
    private double miles;

    public double getMeters() {
        return meters;
    }

    public void setMeters(double meters) {
        this.meters = meters;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public double convertMetersToMiles() {
        return meters * 0.00062137;
    }
    public double convertMilesToMeters() {
        return miles / 0.00062137;
    }
}
