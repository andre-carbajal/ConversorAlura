package net.anvian.conversor.ventanas;

import net.anvian.conversor.util.Temperatures;

import javax.swing.*;
import java.awt.*;

public class Temperatura extends JFrame{
    private JPanel ventana;
    private JLabel title;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton convertirButton;
    private JLabel salida;

    public Temperatura(JFrame parent){
        setTitle("Temperatura");
        setContentPane(ventana);
        setMinimumSize(new Dimension(700, 400));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        comboBox1.addItem("Celsius");
        comboBox1.addItem("Fahrenheit");
        comboBox1.addItem("Kelvin");

        comboBox2.addItem("Celsius");
        comboBox2.addItem("Fahrenheit");
        comboBox2.addItem("Kelvin");

        convertirButton.addActionListener(e -> {
            try {
                double cantidad = Double.parseDouble(textField1.getText());

                if (comboBox1.getSelectedItem() == "Celsius" && comboBox2.getSelectedItem() == "Fahrenheit"){
                    double transform = Temperatures.CelsiusToFahrenheit(cantidad);
                    salida.setText("Tienes " + cantidad + " Celsius equivalnte a " + transform + " Fahrenheit");

                } else if (comboBox1.getSelectedItem() == "Celsius" && comboBox2.getSelectedItem() == "Kelvin") {
                    double transform = Temperatures.CelsiusToKelvin(cantidad);
                    salida.setText("Tienes " + cantidad + " Celsius equivalnte a " + transform + " Kelvin");

                } else if (comboBox1.getSelectedItem() == "Fahrenheit" && comboBox2.getSelectedItem() == "Celsius"){
                    double transform = Temperatures.FahrenheitToCelsius(cantidad);
                    salida.setText("Tienes " + cantidad + " Fahrenheit equivalnte a " + transform + " Celsius");

                }else if (comboBox1.getSelectedItem() == "Fahrenheit" && comboBox2.getSelectedItem() == "Kelvin"){
                    double transform = Temperatures.FahrenheitToKelvin(cantidad);
                    salida.setText("Tienes " + cantidad + " Fahrenheit equivalnte a " + transform + " Kelvin");

                }else if (comboBox1.getSelectedItem() == "Kelvin" && comboBox2.getSelectedItem() == "Celsius"){
                    double transform = Temperatures.KelvinToCelsius(cantidad);
                    salida.setText("Tienes " + cantidad + " Kelvin equivalnte a " + transform + " Celsius");

                }else if (comboBox1.getSelectedItem() == "Kelvin" && comboBox2.getSelectedItem() == "Fahrenheit"){
                    double transform = Temperatures.KelvinToFahrenheit(cantidad);
                    salida.setText("Tienes " + cantidad + " Kelvin equivalnte a " + transform + " Fahrenheit");

                }else {
                    salida.setText("Ingrese un cambio valido");
                }
            }catch (NumberFormatException exception){
                exception.printStackTrace();
                salida.setText("El valor ingresado no es valido");
            }
        });
    }
}
