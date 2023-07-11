package net.anvian.conversor.options;

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
                case "De Soles a Dolar" -> TransformAndShow(money, 0.28, "Dolares");
                case "De Soles a Euro" -> TransformAndShow(money, 0.25, "Euros");
                case "De Soles a Libras" -> TransformAndShow(money, 0.21, "Libras");
                case "De Soles a Yen" -> TransformAndShow(money, 38.78, "Yenes");
                case "De Soles a Won sul-coreano" -> TransformAndShow(money, 356.63,"Won sul-coreano");
                case "De Dolar a Soles" -> TransformAndShow(money, 3.63, "Soles");
                case "De Euro a Soles" -> TransformAndShow(money, 4.0, "Soles");
                case "De Libras a Soles" -> TransformAndShow(money, 4.67, "Soles");
                case "De Yen a Soles" -> TransformAndShow(money, 0.026, "Soles");
                case "De Won sul-coreano a Soles" -> TransformAndShow(money, 0.0028, "Soles");
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

    private static void TransformAndShow(double value, double exchange, String txt){
        value *= exchange;
        value = (double) Math.round(value * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ value + " " + txt);
    }
}