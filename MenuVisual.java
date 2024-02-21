package org.example;
import javax.swing.*;
public class MenuVisual {
        public static void main(String[] args) {
            // Definicion de miVentana con sus valores iniciales
            JFrame miVentana = new JFrame();
            miVentana.setSize(600,500);
            miVentana.setTitle("Catalogo de Clientes");
            miVentana.setLocation(400,150);
            miVentana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


            // Creacion de paneles para encabezado, cuerpo de la GUI y pié
            JPanel panelEncabezado = new JPanel();
            JPanel panelCuerpo     = new JPanel();
            JPanel panelPie        = new JPanel();
            JPanel panelGeneral    = new JPanel();

            // Creación de componentes
            JLabel lblEncabezado = new JLabel();
            lblEncabezado.setText("CATALOGO DE CLIENTES");

            JLabel lblClave = new JLabel("Clave:");
            JTextField jtxFClave = new JTextField(5);
            JLabel lblNombre = new JLabel("Nombre");
            JTextField jtxFNombre = new JTextField(30);
            JLabel lblDireccion = new JLabel("Direccion");
            JTextField jtFDireccion = new JTextField(30);
            JLabel lblCiudad = new JLabel("Ciudad");
            JComboBox jCbCiudad = new JComboBox();
            jCbCiudad.addItem("Selecciona una opcion");
            jCbCiudad.addItem("Veracruz");
            jCbCiudad.addItem("Xalapa");
            jCbCiudad.addItem("Cardel");
            JButton JbAceptar = new JButton("Aceptar");
            JButton JbCancelar = new JButton("Cancelar");


            // Adicion de componentes a paneles
            panelEncabezado.add(lblEncabezado);
            panelCuerpo.add(lblClave);
            panelCuerpo.add(jtxFClave);
            panelCuerpo.add(lblNombre);
            panelCuerpo.add(jtxFNombre);
            panelCuerpo.add(lblDireccion);
            panelCuerpo.add(jtFDireccion);
            panelPie.add(JbAceptar);
            panelPie.add(JbCancelar);


            // Adicion de paneles al frame
            panelGeneral.add(panelEncabezado);
            panelGeneral.add(panelCuerpo);
            panelGeneral.add(panelPie);
            miVentana.add(panelGeneral);

            miVentana.setVisible(true);
        }
    }
