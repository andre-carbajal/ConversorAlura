package net.anvian.conversor.Options;

import net.anvian.conversor.util.Currencies;

import javax.swing.*;

public class Currency {
    public static void init() {
        try {
            String[] currencies = {"De Soles a Dolar", "De Soles a Euro", "De Soles a Libras", "De Soles a Yen", "De Soles a Won sul-coreano" +
                    "De Dolar a Soles", "De Euro a Soles", "De Libras a Soles", "De Yen a Soles", "De Won sul-coreano a Soles"};

            String currency = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir:");
            currency = currency.replace(",", ".");
            double money = Double.parseDouble(currency);

            String option = (JOptionPane.showInputDialog(null, "Monedas", "Entrada",JOptionPane.INFORMATION_MESSAGE, null, currencies, currencies[0])).toString();

            switch (option) {
                case "De Soles a Dolar" -> Currencies.SolesToDolar(money);
                case "De Soles a Euro" -> Currencies.SolesToEuro(money);
                case "De Soles a Libras" -> Currencies.SolesToLibras(money);
                case "De Soles a Yen" -> Currencies.SolesToYen(money);
                case "De Soles a Won sul-coreano" -> Currencies.SolesToWon(money);
                case "De Dolar a Soles" -> Currencies.DolarToSoles(money);
                case "De Euro a Soles" -> Currencies.EuroToSoles(money);
                case "De Libras a Soles" -> Currencies.LibrasToSoles(money);
                case "De Yen a Soles" -> Currencies.YenToSoles(money);
                case "De Won sul-coreano a Soles" -> Currencies.WonToSoles(money);
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