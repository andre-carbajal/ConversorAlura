package net.anvian.conversor.util;

import javax.swing.*;

public class Temperatures {
    public static void CelsiusToFahrenheit(double grades, String from, String to) {
        double transform = (grades * 9/5)+ 32;
        JOptionPane.showMessageDialog(null, "Tienes " + grades + " " + from + " equivalnte a " + transform + " " + to);
    }

    public static void CelsiusToKelvin(double grades, String from, String to) {
        double transform = grades + 273.15;
        JOptionPane.showMessageDialog(null, "Tienes " + grades + " " + from + " equivalnte a " + transform + " " + to);
    }

    public static void FahrenheitToCelsius(double grades, String from, String to) {
        double transform = (grades * -32)* 5/9;
        JOptionPane.showMessageDialog(null, "Tienes " + grades + " " + from + " equivalnte a " + transform + " " + to);
    }

    public static void FahrenheitToKelvin(double grades, String from, String to) {
        double transform = (grades - 32) * 5/9 + 273.15;
        JOptionPane.showMessageDialog(null, "Tienes " + grades + " " + from + " equivalnte a " + transform + " " + to);
    }

    public static void KelvinToCelsius(double grades, String from, String to) {
        double transform = grades - 273.15;
        JOptionPane.showMessageDialog(null, "Tienes " + grades + " " + from + " equivalnte a " + transform + " " + to);
    }

    public static void KelvinToFahrenheit(double grades, String from, String to) {
        double transform = (grades - 273.15) * 9/5 + 32;
        JOptionPane.showMessageDialog(null, "Tienes " + grades + " " + from + " equivalnte a " + transform + " " + to);
    }
}
