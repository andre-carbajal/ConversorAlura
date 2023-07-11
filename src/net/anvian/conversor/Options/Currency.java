package net.anvian.conversor.Options;

import net.anvian.conversor.util.Currencies;

import javax.swing.*;

public class Currency {
    public static void init() {
        double value;

        String[] currencies = {"De Soles a Dolar", "De Soles a Euro", "De Soles a Libras", "De Soles a Yen", "De Soles a Won sul-coreano," +
                "De Dolar a Soles", "De Euro a Soles", "De Libras a Soles", "De Yen a Soles", "De Won sul-coreano a Soles"};
        value= convert();
        String option = (JOptionPane.showInputDialog(null, "Monedas", "Entrada",JOptionPane.INFORMATION_MESSAGE, null, currencies, currencies[0])).toString();

        switch (option) {
            case "De Soles a Dolar" -> Currencies.SolesToDolar(value);
            case "De Soles a Euro" -> Currencies.SolesToEuro(value);
            case "De Soles a Libras" -> Currencies.SolesToLibras(value);
            case "De Soles a Yen" -> Currencies.SolesToYen(value);
            case "De Soles a Won sul-coreano" -> Currencies.SolesToWon(value);
            case "De Dolar a Soles" -> Currencies.DolarToSoles(value);
            case "De Euro a Soles" -> Currencies.EuroToSoles(value);
            case "De Libras a Soles" -> Currencies.LibrasToSoles(value);
            case "De Yen a Soles" -> Currencies.YenToSoles(value);
            case "De Won sul-coreano a Soles" -> Currencies.WonToSoles(value);
        }

        int resp = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Select an Opion", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        switch (resp){
            case 0:
                init();
                break;
            case 1:
                break;
        }
    }

    private static double convert(){
        String currency = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir:");
        currency = currency.replace(",", ".");
        return Double.parseDouble(currency);
    }
}
