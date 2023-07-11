package net.anvian.conversor.options;

import net.anvian.conversor.util.Temperatures;

import javax.swing.*;

public class Temperature {
    public static void init() {
        try {
            String[] temperatures = {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Celsius a Rankine", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Fahrenheit a Rankine"};

            String temperature = JOptionPane.showInputDialog(null, "Ingrese la cantidad que deseas convertir:");
            double grades = Double.parseDouble(temperature);

            String option = (JOptionPane.showInputDialog(null, "Temperature", "Entrada",JOptionPane.INFORMATION_MESSAGE, null, temperatures, temperatures[0])).toString();

            switch (option) {
                case "De Celsius a Fahrenheit" -> Temperatures.CelsiusToFahrenheit(grades);
                case "De Celsius a Kelvin" -> Temperatures.CelsiusToKelvin(grades);
                case "De Celsius a Rankine" -> Temperatures.CelsiusToRankine(grades);
                case "De Fahrenheit a Celsius" -> Temperatures.FahrenheitToCelsius(grades);
                case "De Fahrenheit a Kelvin" -> Temperatures.FahrenheitToKelvin(grades);
                case "De Fahrenheit a Rankine" -> Temperatures.FahrenheitToRankine(grades);
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
