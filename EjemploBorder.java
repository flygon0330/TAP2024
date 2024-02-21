package org.example;
import javax.swing.*;
import java.awt.*;

public abstract class EjemploBorder {
    public static void main(String[] args) {

                // Crear un objeto JFrame
                JFrame ventana = new JFrame("Ejemplo BorderLayout");

                // Establecer el tamaño del JFrame
                ventana.setSize(400, 300);
                ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                ventana.setLocation(250,250);
                

                // Crear un objeto BorderLayout
                BorderLayout layout = new BorderLayout();

                // Establecer el layout del JFrame
                ventana.setLayout(layout);

                // Agregar componentes al JFrame usando las posiciones del BorderLayout
                ventana.add(new JButton("Norte"), BorderLayout.NORTH);
                ventana.add(new JButton("Sur"), BorderLayout.SOUTH);
                ventana.add(new JButton("Este"), BorderLayout.EAST);
                ventana.add(new JButton("Oeste"), BorderLayout.WEST);
                ventana.add(new JButton("Centro"), BorderLayout.CENTER);

                // Mostrar el JFrame
                ventana.setVisible(true);


    }
}


