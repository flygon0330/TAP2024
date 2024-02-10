//version 1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;
        Clientes[] clientes = null;
        Proveedor [] proveedors = null;
        Producto [] productos = null;
        Ciudades [] ciudades = null;
        Estados [] estados= null;
        do {
            System.out.println("****** Menu Catalogo ******");
            System.out.println("1. Clientes");
            System.out.println("2. Productos");
            System.out.println("3. Proveedores");
            System.out.println("4. Ciudades");
            System.out.println("5. Estados");
            System.out.println("6. Reporte");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1: clientes= Clientes.datos(); break;
                case 2: productos = Producto.datos(); break;
                case 3: proveedors = Proveedor.datos();break;
                case 4: ciudades = Ciudades.datos(); break;
                case 5: estados = Estados.datos(); break;
                case 6: Clientes.imprimir(clientes); Producto.imprimir(productos); Proveedor.imprimir(proveedors);Ciudades.imprimir(ciudades); Estados.imprimir(estados); break;
                case 0: System.out.println("Saliendo del programa. ¡Adios!"); break;
                default: System.out.println("Upps! Intente nuevamente."); break;
            }
        } while (opc != 0);
        teclado.close();
    }
}