package org.example;
import javax.swing.*;
public class BoxLayout {
    public static void main(String[] args) {
      //Propiedades de la ventana
        JFrame ventana = new JFrame();
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setTitle("Agregar estudiantes");
        ventana.setLocation(400,200);


       //Paneles
        JPanel panelGeneral = new JPanel();
        panelGeneral.setLayout(new javax.swing.BoxLayout(panelGeneral, javax.swing.BoxLayout.Y_AXIS ));

        // Inicializar componentes
        JLabel lblEncabezado = new JLabel("Menu agregar alumnos");
        JLabel lblNombre = new JLabel("Nombre");
        JTextField jtfNombre = new JTextField(30);
        JLabel lblNum = new JLabel("Número de control");
        JTextField jtfNum = new JTextField(8);
        JLabel lblDireccion = new JLabel("Direccion");
        JTextField jtfDireccion = new JTextField(30);
        JButton butAceptar = new JButton("Aceptar");
        JButton butCancelar = new JButton("Cancelar");


        // Agregar componentes al panel
      panelGeneral.add(lblEncabezado);
      panelGeneral.add(lblNombre);
      panelGeneral.add(jtfNombre);
      panelGeneral.add(lblNum);
      panelGeneral.add(jtfNum);
      panelGeneral.add(lblDireccion);
      panelGeneral.add(jtfDireccion);
      panelGeneral.add(butAceptar);
      panelGeneral.add(butCancelar);

        // Agregar el panel al JFrame
        ventana.add(panelGeneral);


           ventana.setVisible(true);

    }
}

