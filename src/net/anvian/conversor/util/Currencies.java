package net.anvian.conversor.util;

import javax.swing.*;

public class Currencies {
    public static void SolesToDolar(double value) {
        value *= 0.28;
        value = (double)Math.round(value * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ value + " Dolares");
    }

    public static void SolesToEuro(double value) {
        value *= 0.25;
        value = (double)Math.round(value * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ value + " Euros");
    }

    public static void SolesToLibras(double value) {
        value *= 0.21;
        value = (double)Math.round(value * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ value + " Libras");
    }

    public static void SolesToYen(double value) {
        value *= 38.78;
        value = (double)Math.round(value * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ value + " Yenes");
    }

    public static void SolesToWon(double value) {
        value *= 356.63;
        value = (double)Math.round(value * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ value + " Woon sul-coreano");
    }

    public static void DolarToSoles(double value) {
        value *= 3.63;
        value = (double)Math.round(value * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ value + " Soles");
    }

    public static void EuroToSoles(double value) {
        value *= 4.0;
        value = (double)Math.round(value * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ value + " Soles");
    }

    public static void LibrasToSoles(double value) {
        value *= 4.67;
        value = (double)Math.round(value * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ value + " Soles");
    }

    public static void YenToSoles(double value) {
        value *= 0.026;
        value = (double)Math.round(value * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ value + " Soles");
    }

    public static void WonToSoles(double value) {
        value *= 0.0028;
        value = (double)Math.round(value * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ value + " Soles");
    }
}
