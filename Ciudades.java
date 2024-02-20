package org.example;

import  java.util.*;
public class Ciudades {
    public int clave;
    public String nombre;

    public Ciudades() {
    }

    public Ciudades(int clave, String nombre) {
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

    public static Ciudades[] datos() {
        Scanner tec = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero de ciudades");
        int c = tec.nextInt();
        tec.nextLine();

        Ciudades[] cuidad = new Ciudades[c];

        for (int i = 0; i < cuidad.length; i++) {
            cuidad[i] = new Ciudades();

            System.out.println("Escriba el nombre de la cuidad " + (i + 1) + ":");
            cuidad[i].nombre = tec.nextLine();

            System.out.println("Escriba la clave de la ciudad " + (i + 1) + ":");
            cuidad[i].clave = tec.nextInt();
            tec.nextLine();
        }
        return cuidad;
    }

    public static void imprimir(Ciudades[] ciudades) {
        if (ciudades != null) {
            for (Ciudades ciudades1 : ciudades) {
                if (ciudades != null) {
                    System.out.println("Nombre: " + ciudades1.getNombre());
                    System.out.println("Clave: " + ciudades1.getClave());
                    System.out.println("--------------");
                } else {
                    System.out.println("la cuidad no existe.");
                }
            }
        } else {
            System.out.println("No hay ciudades para imprimir.");
        }
    }

}