package net.anvian.conversor.util;

import javax.swing.*;

public class Currencies {
    public static void TransformAndShow(double value, double exchange, String from, String to , JLabel label){
        double transform = (double) Math.round(value * exchange * 100d)/100;
        label.setText("Tienes " + value + " " + from + " equivalente a " + transform + " " + to);
    }
}
