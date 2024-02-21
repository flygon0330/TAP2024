import javax.swing.*;
import java.awt.*;

public class VProducto {
    public static void main(String[]args){
    JFrame VentanaProd = new JFrame();
    
    

    VentanaProd.setSize(600, 300);
    VentanaProd.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    VentanaProd.setTitle("Productos");
    VentanaProd.setLocation(400,150);
    Color color = new Color(255,219,231);
    
    //Panel
    JPanel panelG = new JPanel();
    panelG.setLayout(new javax.swing.BoxLayout(panelG, javax.swing.BoxLayout.Y_AXIS ));
    panelG.setLayout(new GridLayout(7, 2, 10, 10));
    panelG.setBackground(color);
    
    JPanel panelEncabezado = new JPanel();
    JPanel panelCuerpo = new JPanel();
    JPanel panelPie = new JPanel();
    
    //Componentes
    JLabel lblEncabezado=new JLabel("Catalogo Producto");
    JLabel lblNombre = new JLabel("Nombre del Producto: ");
    JTextField jtxFNombre = new JTextField(20);
    JButton jBtnAceptar = new JButton("Aceptar");
    JButton jBtnCancelar = new JButton("Cancelar");
    
    
    JLabel lblClave = new JLabel("Clave Producto");
    lblClave.setFont(new Font("Arial", 1 , 14));
    
    JTextField jtxFClave = new JTextField(5);
    jtxFClave.setText("00000");
    
    JLabel lblCantidad = new JLabel("Cuantos productos desea:");
        JComboBox jCmbCantidad = new JComboBox();
        jCmbCantidad.addItem("1");
        jCmbCantidad.addItem("2");
        jCmbCantidad.addItem("3");
        jCmbCantidad.addItem("4");
        jCmbCantidad.addItem("5");
    
   
  //Agregar componentes al panel
     panelEncabezado.add(lblEncabezado);
        panelCuerpo.add(lblClave);
        panelCuerpo.add(jtxFClave);
        panelCuerpo.add(lblNombre);
        panelCuerpo.add(jtxFNombre);
        panelCuerpo.add(lblCantidad);
        panelCuerpo.add(jCmbCantidad);
        panelPie.add(jBtnAceptar);
        panelPie.add(jBtnCancelar);
        
        panelG.add(panelEncabezado);
        panelG.add(panelCuerpo);
        panelG.add(panelPie);
    
    VentanaProd.add(panelG);
    VentanaProd.setVisible(true);    
    }
}
