package net.anvian.conversor.ventanas;

import javax.swing.*;
import java.awt.*;

public class Window extends  JFrame{
    private JPanel ventana;
    private JLabel title;
    private JLabel image;
    private JButton divisasButton;
    private JButton temperaturaButton;

    public Window(JFrame parent){
        setTitle("Conversor Alura");
        setContentPane(ventana);
        setMinimumSize(new Dimension(700, 400));
        setLocationRelativeTo(parent);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        divisasButton.addActionListener(e -> {
            Divisas divisas = new Divisas(null);
            divisas.setVisible(true);
        });
        temperaturaButton.addActionListener(e -> {
            Temperatura temperature = new Temperatura(null);
            temperature.setVisible(true);
        });
    }

}
