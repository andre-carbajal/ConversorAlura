package net.anvian.conversor;

import net.anvian.conversor.Options.Currency;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] converters = {"Conversor de moneda", "Conversor de temperatura"};

        String option = (JOptionPane.showInputDialog(null, "Menu", "Entrada",JOptionPane.INFORMATION_MESSAGE, null, converters, converters[0])).toString();

        if (option.equals(converters[0])){
            Currency.init();
        } else if (option.equals(converters[1])) {
            //TODO temperature
        }
    }
}