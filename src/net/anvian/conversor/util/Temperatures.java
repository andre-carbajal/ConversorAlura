package net.anvian.conversor.util;

import javax.swing.*;

public class Temperatures {
    public static void CelsiusToFahrenheit(double grades) {
        grades = (grades * 9/5)+ 32;
        JOptionPane.showMessageDialog(null, "La temperatura es de " + grades +" Fahrenheit");
    }

    public static void CelsiusToKelvin(double grades) {
        grades = grades + 273.15;
        JOptionPane.showMessageDialog(null, "La temperatura es de " + grades +" Kelvin");
    }

    public static void CelsiusToRankine(double grades) {
        grades = (grades * 9/5)+ 491.67;
        JOptionPane.showMessageDialog(null, "La temperatura es de " + grades +" Rankine");
    }

    public static void FahrenheitToCelsius(double grades) {
        grades = (grades * -32)* 5/9;
        JOptionPane.showMessageDialog(null, "La temperatura es de " + grades +" Celsius");
    }

    public static void FahrenheitToKelvin(double grades) {
        grades = (grades * 459.67)+ (double) 5 /9;
        JOptionPane.showMessageDialog(null, "La temperatura es de " + grades +" Kelvin");
    }

    public static void FahrenheitToRankine(double grades) {
        grades = grades + 459.67;
        JOptionPane.showMessageDialog(null, "La temperatura es de " + grades +" Rankine");
    }
}
