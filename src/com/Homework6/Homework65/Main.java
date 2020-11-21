package com.Homework6.Homework65;

public class Main {
    public static void main(String[] args) {
        TemperatureConvertor temperature = new TemperatureConvertor();

        System.out.println(temperature.convertCelsiusToFahrenheit(100));
        System.out.println(temperature.convertCelsiusToKelvin(100));
        System.out.println(temperature.convertFahrenheitToCelsius(100));
        System.out.println(temperature.convertFahrenheitToKelvin(100));
        System.out.println(temperature.convertKelvinToCelsius(100));
        System.out.println(temperature.convertKelvinToFahrenheit(100));
    }
}
