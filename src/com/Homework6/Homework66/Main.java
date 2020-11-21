package com.Homework6.Homework66;

public class Main {
    public static void main(String[] args) {
        DistanceConverter converter = new DistanceConverter();
        converter.setMeters(1000);
        converter.setMiles(10);

        System.out.println(converter.convertMetersToMiles());
        System.out.println(converter.convertMilesToMeters());
    }
}
