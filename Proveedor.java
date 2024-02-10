package org.example;
// revisado por gustavo
import java.util.Scanner;

public class Proveedor {

    public int clave;
    public String nombre;

    public Proveedor() {
    }

    public Proveedor(int clave, String nombre) {
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

    public static Proveedor[] datos() {
        Scanner t = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero de proveedores");
        int a = t.nextInt();
        t.nextLine();

        Proveedor[] proveedor = new Proveedor[a];

        for (int i = 0; i < proveedor.length; i++) {
            proveedor[i] = new Proveedor();

            System.out.println("Escriba el nombre del proveedor  " + (i + 1) + ":");
            proveedor[i].nombre = t.nextLine();

            System.out.println("Escriba la clave del proveedor " + (i + 1) + ":");
            proveedor[i].clave = t.nextInt();
            t.nextLine();
        }
        return proveedor;
    }

    public static void imprimir(Proveedor[] proveedor) {
        if (proveedor != null) {
            for (Proveedor proveedors : proveedor) {
                if (proveedor != null) {
                    System.out.println("Nombre: " + proveedors.getNombre());
                    System.out.println("Clave: " + proveedors.getClave());
                    System.out.println("--------------");
                } else {
                    System.out.println("El proveedor no existe.");
                }
            }
        } else {
            System.out.println("No hay proveedores para imprimir.");
        }
    }
}


