package net.anvian.conversor.options;

import javax.swing.*;

public class Currency {
    public static void init() {
        try {
            String[] currencies = {"De Soles a Dolar", "De Soles a Euro", "De Soles a Libras", "De Soles a Yen", "De Soles a Won sul-coreano" +
                    "De Dolar a Soles", "De Euro a Soles", "De Libras a Soles", "De Yen a Soles", "De Won sul-coreano a Soles"};
            String option = (JOptionPane.showInputDialog(null, "Monedas", "Entrada",JOptionPane.INFORMATION_MESSAGE, null, currencies, currencies[0])).toString();

            String currency = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir:");
            currency = currency.replace(",", ".");
            double money = Double.parseDouble(currency);

            switch (option) {
                case "De Soles a Dolar" -> TransformAndShow(money, 0.28, "Soles", "Dolares");
                case "De Soles a Euro" -> TransformAndShow(money, 0.25, "Soles", "Euros");
                case "De Soles a Libras" -> TransformAndShow(money, 0.21, "Soles", "Libras");
                case "De Soles a Yen" -> TransformAndShow(money, 38.78, "Soles", "Yenes");
                case "De Soles a Won sul-coreano" -> TransformAndShow(money, 356.63, "Soles", "Won sul-coreano");
                case "De Dolar a Soles" -> TransformAndShow(money, 3.63, "Dolares", "Soles");
                case "De Euro a Soles" -> TransformAndShow(money, 4.0, "Euro", "Soles");
                case "De Libras a Soles" -> TransformAndShow(money, 4.67, "Libras", "Soles");
                case "De Yen a Soles" -> TransformAndShow(money, 0.026, "Yen", "Soles");
                case "De Won sul-coreano a Soles" -> TransformAndShow(money, 0.0028, "Won sul-coreano", "Soles");
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

    private static void TransformAndShow(double value, double exchange, String from, String to){
        double transform = (double) Math.round(value * exchange * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + value + " " + from + " equivalente a " + transform + " " + to);
    }
}