package net.anvian.conversor;

import net.anvian.conversor.options.Currency;
import net.anvian.conversor.options.Temperature;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] converters = {"Conversor de moneda", "Conversor de temperatura"};
        String option = (JOptionPane.showInputDialog(null, "Menu", "Entrada",JOptionPane.INFORMATION_MESSAGE, null, converters, converters[0])).toString();

        switch (option){
            case "Conversor de moneda" -> Currency.init();
            case "Conversor de temperatura" -> Temperature.init();
        }
    }
}