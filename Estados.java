import  java.util.Scanner;

public class Estados {
    private int clave;
    private String nombre;
    public Estados() {
    }

    public Estados(int clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Estados[] datos() {
        System.out.println("Escriba  el numero de estados:");
        Scanner teclado = new Scanner(System.in);
        int c = teclado.nextInt();
        teclado.nextLine();
        Estados[] estados = new Estados[c];

        for (int i = 0; i < estados.length; i++) {
            estados[i] = new Estados();

            System.out.println("Escriba el nombre del estado " + (i + 1) + ":");
            estados[i].nombre = teclado.nextLine();

            System.out.println("Escriba la clave del estado " + (i + 1) + ":");
            estados[i].clave = teclado.nextInt();
            teclado.nextLine();
        }
        return estados;

    }
    public static void imprimir(Estados[] estados) {
        if (estados != null) {
            for (Estados estado : estados) {
                if (estado != null) {
                    System.out.println("Nombre: " + estado.getNombre());
                    System.out.println("Clave: " + estado.getClave());
                    System.out.println("--------------");
                } else {
                    System.out.println("El estado no existe.");
                }
            }
        } else {
            System.out.println("No hay estados para imprimir.");
        }
    }
}
