import javax.swing.*;
import java.awt.*;

public class VProducto {
    public static void main(String[]args){
    JFrame VentanaProd = new JFrame();
    
    //JPanel Pan= new JPanel(new GridLayout(600, 400));
   
    
    VentanaProd.setSize(400, 300);
    VentanaProd.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    VentanaProd.setTitle("Productos");
    VentanaProd.setLocation(400,150);
    
    JPanel panelG = new JPanel();
    panelG.setLayout(new javax.swing.BoxLayout(panelG, javax.swing.BoxLayout.Y_AXIS ));
    
    JPanel panelEncabezado = new JPanel();
    JPanel panelCuerpo = new JPanel();
    JPanel panelPie = new JPanel();
    
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
