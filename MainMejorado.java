package org.example;
import javax.swing.*;
import java.awt.*;
public class MainMejorado {
        public static void main(String[] args) {
            JFrame ventana = new JFrame("Menu Proveedores");
            JPanel panelcito = new JPanel();
            //Botones y color
            JButton btnaceptar = new JButton("GUARDAR");
            JButton btncancelar = new JButton("CANCELAR");
            btnaceptar.setBackground(Color.green);
            btncancelar.setBackground(Color.yellow);
            JSpinner edad = new JSpinner(new SpinnerNumberModel(18 ,18, 99, 1));

            JLabel lblNom = new JLabel("Nombre:");
            JLabel lblCla = new JLabel("Clave:");
            JLabel lblNomEmp = new JLabel("Empresa a la que pertenece:");
            JLabel lblEdad = new JLabel("Edad:");

            //Campos de texto
            JTextField jtfNombre = new JTextField();
            JTextField jtfCla = new JTextField();
            JTextField jtfEmp = new JTextField();

            ventana.add(panelcito);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setLocation(300,250);
            ventana.setSize(400,400);




            panelcito.setLayout(new GridLayout(8, 2, 4, 4));
            panelcito.add(lblNom);
            panelcito.add(jtfNombre);
            panelcito.add(lblCla);
            panelcito.add(jtfCla);
            panelcito.add(lblNomEmp);
            panelcito.add(jtfEmp);
            panelcito.add(lblEdad);
            panelcito.add(edad);
            panelcito.add(btnaceptar);
            panelcito.add(btncancelar);

            ventana.setVisible(true);
        }
    }


