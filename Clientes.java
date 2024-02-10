import java.util.Scanner;
public class Clientes {
        private String nombre;
        private int clave;

        public Clientes() {
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

        public static Clientes[] datos() {
            System.out.println("Escriba  el numero de clientes:");
            Scanner teclado = new Scanner(System.in);
            int c = teclado.nextInt();
            teclado.nextLine();
            Clientes[] clientes = new Clientes[c];

            for (int i = 0; i < clientes.length; i++) {
                clientes[i] = new Clientes();

                System.out.println("Escriba el nombre del cliente " + (i + 1) + ":");
                clientes[i].nombre = teclado.nextLine();

                System.out.println("Escriba la clave del cliente " + (i + 1) + ":");
                clientes[i].clave = teclado.nextInt();
                teclado.nextLine();
            }
            return clientes;

        }
        public static void imprimir(Clientes[] clientes) {
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
