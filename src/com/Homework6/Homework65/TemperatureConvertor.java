package com.Homework6.Homework65;
//5
//Design a class named TemperatureConverter
//	methods
//	- convertFahrenheitToCelsius
//	- convertFahrenheitToKelvin
//
//	- convertCelsiusToFahrenheit
//	- convertCelsiusToKelvin
//
//	- convertKelvinToFahrenheit
//	- convertKelvinToCelsius
//
public class TemperatureConvertor {
    public double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9;
    }
    public double convertFahrenheitToKelvin(double fahrenheit) {
        return (((fahrenheit - 32) * 5.0 )/ 9) +273.15;
    }

    public double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5) + 32;
    }
    public double convertCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double convertKelvinToFahrenheit(double kelvin) {
        return (((kelvin - 273.15) * 9.0) / 5) + 32;
    }
    public double convertKelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
