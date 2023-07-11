package net.anvian.conversor.options;

import net.anvian.conversor.util.Temperatures;

import javax.swing.*;

public class Temperature {
    public static void init() {
        try {
            String[] temperatures = {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit"};
            String option = (JOptionPane.showInputDialog(null, "Temperature", "Entrada",JOptionPane.INFORMATION_MESSAGE, null, temperatures, temperatures[0])).toString();

            String temperature = JOptionPane.showInputDialog(null, "Ingrese la cantidad que deseas convertir:");
            double grades = Double.parseDouble(temperature);

            switch (option) {
                case "De Celsius a Fahrenheit" -> Temperatures.CelsiusToFahrenheit(grades, "Celsius", "Fahrenheit");
                case "De Celsius a Kelvin" -> Temperatures.CelsiusToKelvin(grades, "Celsius", "Kelvin");
                case "De Fahrenheit a Celsius" -> Temperatures.FahrenheitToCelsius(grades, "Fahrenheit", "Celsius");
                case "De Fahrenheit a Kelvin" -> Temperatures.FahrenheitToKelvin(grades, "Fahrenheit", "Kelvin");
                case "De Kelvin a Celsius" -> Temperatures.KelvinToCelsius(grades, "Kelvin", "Celsius");
                case "De Kelvin a Fahrenheit" -> Temperatures.KelvinToFahrenheit(grades, "Kelvin", "Fahrenheit");
            }

            int resp = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Select an Opion", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            switch (resp) {
                case 0 -> init();
                case 1 -> JOptionPane.showMessageDialog(null, "El Programa termino exitosamente");
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "El valor ingresado no es valido");
            init();
        }
    }
}
