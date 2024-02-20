package org.example;
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
            Producto[] productos = new Producto[c];

            for (int i = 0; i < productos.length; i++) {
                productos[i] = new Producto();

                System.out.println("Escriba el nombre del producto " + (i + 1) + ":");
                productos[i].nombre = teclado.nextLine();

                System.out.println("Escriba la clave del producto " + (i + 1) + ":");
                productos[i].clave = teclado.nextInt();
                teclado.nextLine();
            }            return productos;
        }
        public static void imprimir(Producto[] productos) {
        if (productos != null) {
            for (Producto produ : productos) {
                if (productos != null) {
                    System.out.println("Nombre: " + produ.getNombre());
                    System.out.println("Clave: " + produ.getClave());
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

