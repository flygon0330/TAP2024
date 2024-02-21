package practica;
import javax.swing.*;
import java.awt.*;

public class GUIClientes{

    public static void main(String[] args) {
        JFrame ventanita = new JFrame("Registro de Clientes");
        JPanel panelcito=  new JPanel();
        Color color = new Color(255,219,231);
        
        panelcito.setLayout(new GridLayout(7, 2, 10, 10)); // Agregamos espacio entre los componentes
        panelcito.setBackground(color); // Establecemos el color de fondo del panel
        
        
        //Mascota de Java Duke - Icono
        ImageIcon dukeicono = new ImageIcon("C:/Users/Angelo/IdeaProjects/GUI/src/main/java/ejercicios/duke.png");

        JLabel lnombre = new JLabel("Nombre:");
        JLabel lapellido = new JLabel("Apellido:");
        JLabel lclave = new JLabel("Clave:");
        JLabel lsexo = new JLabel("Sexo:");
        JLabel ledad = new JLabel("Edad:"); 
        
        JTextField nombre = new JTextField();
        JTextField apellido = new JTextField();
        JTextField clave = new JTextField();
        JSpinner edad = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1)); // Spinner para la edad
        
        JComboBox<String> cbsexo = new JComboBox<>();
        cbsexo.addItem("Masculino");
        cbsexo.addItem("Femenino");
        cbsexo.addItem("No binario");
        cbsexo.addItem("Prefiero no decir");
        
        //Botones y color
        JButton btnaceptar = new JButton("ACEPTAR✅");
        JButton btncancelar = new JButton("CANCELAR❌");
        btnaceptar.setBackground(Color.GREEN);
        btncancelar.setBackground(Color.RED);
        
      
        panelcito.add(lnombre);
        panelcito.add(nombre);
        panelcito.add(lapellido);
        panelcito.add(apellido);
        panelcito.add(lclave);
        panelcito.add(clave);
        panelcito.add(lsexo);
        panelcito.add(cbsexo); // Agregamos el JComboBox al panel
        panelcito.add(ledad);
        panelcito.add(edad); // Agregamos el spinner al panel
        
        panelcito.add(btnaceptar);
        panelcito.add(btncancelar);
        ventanita.setIconImage(dukeicono.getImage());
        ventanita.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanita.setSize(300, 300);
        ventanita.add(panelcito);
        ventanita.setVisible(true);
    }
}
