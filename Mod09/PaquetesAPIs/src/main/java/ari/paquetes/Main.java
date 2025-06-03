package ari.paquetes;

import ari.otro.Java;

public class Main {
    // https://docs.oracle.com/javase/9/docs/api/index.html?overview-summary.html

    public static void main(String[] args) {
        // API de Java
        System.out.println("Usando Math: Número PI" + Math.PI);

        System.out.println("Math.max: 200 y 500 -> " + Math.max(200, 500));

        // Clase importada
        Java java = new Java();
        System.out.println("Clase Importada: " + java.getTitulo());


    }
}
