package ari.arreglos;

public class Arrglos {
    public static void main(String[] args) {
        // Arreglos

        String nombres[];
        nombres = new String[3];

        nombres[0] = "Valor01";
        nombres[1] = "Valor02";
        nombres[2] = "Valor03";

        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);

        // Definir Arreglos en 1 linea
        String arr02[] = new String[2];

        // Definir Arreglo con valore en la declaración
        String arr03[] = { "val01", "val02","val03"};

        //Recorrer Arreglos
        int notas[] = { 8,9,3};
        int sum = 0;
        System.out.println(notas.length);

        for (int i=0; i < notas.length; i++) {
            sum += notas[i];
        }
        double promedio = (double) sum / notas.length;
        System.out.printf("El promedio de notas es %.2f", promedio);
        System.out.println();

        // Strings
        // Podemos obtener un carácter con respecto a su índice utilizando el método charAt().
        String msj01 = "Hola Mundo";
        char lentraH = msj01.charAt(0);
        System.out.println(lentraH);

        // Si no conocemos en que índice se encuentra un caracter, haremos uso de los métodos indexOf o lastIndexOf.
        String msj02 = "Hola Mundo";
        int indice02 = msj02.indexOf("M");
        System.out.println(indice02);

        // foreah
        int notas01[] = { 8,9,3};
        int sum01 = 0;

        for (int valorPorIndice: notas01 ) {
            sum01 += valorPorIndice;
        }
        double promedio01 = (double) sum01 / notas01.length;
        System.out.printf("El promedio de notas es %.2f", promedio01);
        System.out.println();

        // Insertar valores
        int val02[] = new int[3];

        for (int i=0; i < val02.length; i++) {
            val02[i] = i;
        }
        for (int val: val02) {
            System.out.println("Los valores son: " + val);
        }

        // Arreglos multidimensionales
        // int[filas][columnas]
        int matriz[][] = new int[4][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        System.out.println("La valor de la matriz en [0,1] es: " + matriz[0][1]);

        // Recorrer una matriz
        for (int posX=0; posX < matriz.length; posX++){
            for (int posY=0; posY < matriz[posX].length; posY++) {
                matriz[posX][posY] = posY + 1;
                System.out.printf("El valor de %d,%d es: %d%n", posX, posY, matriz[posX][posY]);
            }
        }

        // Arreglos dinámicos
        int calificaciones[][] = new int[3][];
        calificaciones[0] = new int[1]; // E
        calificaciones[1] = new int[2]; // A
        calificaciones[2] = new int[3]; // D

        calificaciones[0][0] = 8;

        calificaciones[1][0] = 9;
        calificaciones[1][1] = 10;

        calificaciones[2][0] = 8;
        calificaciones[2][1] = 6;
        calificaciones[2][2] = 7;

        for (int[] calificacionesPorAlumno: calificaciones) {
            for (int calificacion: calificacionesPorAlumno) {
                System.out.print(calificacion + " ");
            }
            System.out.println("");
        }
    }
}
