package net.anvian.conversor.ventanas;

import net.anvian.conversor.util.Currencies;

import javax.swing.*;
import java.awt.*;

public class Divisas extends JFrame{
    private JPanel ventana;
    private JLabel title;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JLabel salida;
    private JButton convertirButton;

    public Divisas(JFrame parent){
        setTitle("Divisas");
        setContentPane(ventana);
        setMinimumSize(new Dimension(700, 400));
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        comboBox1.addItem("");
        comboBox1.addItem("Soles");
        comboBox1.addItem("Dolar");
        comboBox1.addItem("Euro");
        comboBox1.addItem("Libras");
        comboBox1.addItem("Yen");
        comboBox1.addItem("Won sul-coreano");

        comboBox1.addItemListener(e -> {
            if (comboBox1.getSelectedItem() == "Soles"){
                comboBox2.removeAllItems();
                comboBox2.addItem("Dolar");
                comboBox2.addItem("Euro");
                comboBox2.addItem("Libras");
                comboBox2.addItem("Yen");
                comboBox2.addItem("Won sul-coreano");
            }else if (comboBox1.getSelectedItem() != "Soles"){
                comboBox2.removeAllItems();
                comboBox2.addItem("Soles");
            }
        });

        convertirButton.addActionListener(e -> {
            try {
                double cantidad = Double.parseDouble(textField1.getText());

                if (comboBox1.getSelectedItem() == "Soles" && comboBox2.getSelectedItem() == "Dolar"){
                    Currencies.TransformAndShow(cantidad, 0.28, "Soles", "Dolares", salida);

                }else if (comboBox1.getSelectedItem() == "Soles" && comboBox2.getSelectedItem() == "Euro"){
                    Currencies.TransformAndShow(cantidad, 0.25, "Soles", "Euros", salida);

                }else if (comboBox1.getSelectedItem() == "Soles" && comboBox2.getSelectedItem() == "Libras"){
                    Currencies.TransformAndShow(cantidad, 0.21, "Soles", "Libras", salida);

                }else if (comboBox1.getSelectedItem() == "Soles" && comboBox2.getSelectedItem() == "Yen"){
                    Currencies.TransformAndShow(cantidad, 38.78, "Soles", "Yenes", salida);

                }else if (comboBox1.getSelectedItem() == "Soles" && comboBox2.getSelectedItem() == "Won sul-coreano"){
                    Currencies.TransformAndShow(cantidad, 356.63, "Soles", "Won sul-coreano", salida);

                }else if (comboBox1.getSelectedItem() == "Dolar" && comboBox2.getSelectedItem() == "Soles"){
                    Currencies.TransformAndShow(cantidad, 3.63, "Dolar", "Soles", salida);

                }else if (comboBox1.getSelectedItem() == "Euro" && comboBox2.getSelectedItem() == "Soles"){
                    Currencies.TransformAndShow(cantidad, 4.0, "Euro", "Soles", salida);

                }else if (comboBox1.getSelectedItem() == "Libras" && comboBox2.getSelectedItem() == "Soles"){
                    Currencies.TransformAndShow(cantidad, 4.67, "Libras", "Soles", salida);

                }else if (comboBox1.getSelectedItem() == "Yen" && comboBox2.getSelectedItem() == "Soles"){
                    Currencies.TransformAndShow(cantidad, 0.026, "Yen", "Soles", salida);

                }else if (comboBox1.getSelectedItem() == "Won sul-coreano" && comboBox2.getSelectedItem() == "Soles"){
                    Currencies.TransformAndShow(cantidad, 0.0028, "Won sul-coreano", "Soles", salida);

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
