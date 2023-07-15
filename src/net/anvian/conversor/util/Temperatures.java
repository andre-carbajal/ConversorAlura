package net.anvian.conversor.util;

public class Temperatures {
    public static double CelsiusToFahrenheit(double grades) {
        return (grades * 9/5)+ 32;
    }

    public static double CelsiusToKelvin(double grades) {
        return grades + 273.15;
    }

    public static double FahrenheitToCelsius(double grades) {
        return (grades - 32)* 5/9;
    }

    public static double FahrenheitToKelvin(double grades) {
        return (grades - 32) * 5/9 + 273.15;
    }

    public static double KelvinToCelsius(double grades) {
        return grades - 273.15;
    }

    public static double KelvinToFahrenheit(double grades) {
        return (grades - 273.15) * 9/5 + 32;
    }
}
