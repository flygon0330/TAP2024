import java.util.Scanner;
public class Producto {
        private String nombre;
        private int clave;

        public Producto() {
            this.nombre = nombre;
            this.clave = clave;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getClave() {
            return clave;
        }

        public void setClave(int clave) {
            this.clave = clave;
        }

        public static Producto[] datos() {
            System.out.println("¿Cuantos productos desea?:");
            Scanner teclado = new Scanner(System.in);
            int c = teclado.nextInt();
            teclado.nextLine();
            Producto[] Productos = new Producto[c];

            for (int i = 0; i < Productos.length; i++) {
                Productos[i] = new Producto();

                System.out.println("Escriba el nombre del producto " + (i + 1) + ":");
                Productos[i].nombre = teclado.nextLine();

                System.out.println("Escriba la clave del producto " + (i + 1) + ":");
                Productos[i].clave = teclado.nextInt();
                teclado.nextLine();
            }            return Productos;
        }public static void imprimir(Clientes[] clientes) {
        if (clientes != null) {
            for (Clientes cliente : clientes) {
                if (cliente != null) {
                    System.out.println("Nombre: " + cliente.getNombre());
                    System.out.println("Clave: " + cliente.getClave());
                    System.out.println("--------------");
                } else {
                    System.out.println("El cliente no existe.");
                }
            }
        } else {
            System.out.println("No hay clientes para imprimir.");
        }
      }
    }

