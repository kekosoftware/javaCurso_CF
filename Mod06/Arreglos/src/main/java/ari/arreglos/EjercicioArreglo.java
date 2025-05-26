package ari.arreglos;

import java.util.Arrays;
import java.util.OptionalInt;

public class EjercicioArreglo {
    public static void main (String[] args) {
        int numeros[] = new int[100];

        for (int i=0; i<numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100);
        }

        // 1. Mostrar en consola el número mayor.
        mostrarNumeroMayor(numeros);

        // 2. Mostrar en consola el número menor.
        mostrarNumeroMenor(numeros);

        // 3. Mostrar en consola todos los números primos.
        mostrarNumerosPrimos(numeros);

        // 4. Mostrar en consola todos los números pares.
        mostrarNumerosPares(numeros);

        // 5. Mostrar en consola el arreglo de forma ascendente.
        mostrarArregloAscendente(numeros);

        // 6. Mostrar en consola el promedio del arreglo.
        mostrarPromedioArreglo(numeros);

        // 7. Mostrar en consola la suma del primer y último elemento del arreglo.
        mostrarSumaPrimerUltimo(numeros);

        // 8. Mostrar en consola el mensaje "Existe cien" en dado caso el arreglo almacene por lo menos un cien.
        verificarExistenciaCien(numeros);
    }

    public static void mostrarNumeroMayor(int[] arr) {
        // Arrays.stream(numeros) crea un IntStream
        // .max() devuelve un OptionalInt (porque el arreglo podría estar vacío)
        OptionalInt mayorOptional = Arrays.stream(arr).max();

        if (mayorOptional.isPresent()) { // Verifica si hay un valor presente (arreglo no vacío)
            System.out.print("\n1. Número mayor (con Stream): " + mayorOptional.getAsInt());
        } else {
            System.out.print("\n1. El arreglo está vacío.");
        }
        System.out.println();
    }

    public static void mostrarNumeroMenor(int[] arr) {
        OptionalInt menorOptional = Arrays.stream(arr).min();
        if (menorOptional.isPresent()) { // Verifica si hay un valor presente (arreglo no vacío)
            System.out.print("\n2. Número menor (con Stream): " + menorOptional.getAsInt());
        } else {
            System.out.print("\n2. El arreglo está vacío.");
        }
        System.out.println();
    }

    /**
     * Muestra todos los números primos en el arreglo.
     * @param arr El arreglo de números enteros.
     */
    public static void mostrarNumerosPrimos(int[] arr) {
        System.out.print("\n3. Números primos: ");
        boolean hayPrimos = false;
        for (int numero : arr) {
            if (esPrimo(numero)) { // Llamamos a una función auxiliar para verificar si es primo
                System.out.print(numero + " ");
                hayPrimos = true;
            }
        }
        if (!hayPrimos) {
            System.out.print("No hay números primos en este arreglo.");
        }
        System.out.println(); // Salto de línea al final
    }

    /**
     * Verifica si un número dado es primo.
     * Un número primo es mayor que 1 y solo es divisible por 1 y por sí mismo.
     * @param num El número a verificar.
     * @return true si el número es primo, false en caso contrario.
     */
    public static boolean esPrimo(int num) {
        if (num <= 1) { // 0 y 1 no son primos
            return false;
        }
        // Solo necesitamos verificar divisores hasta la raíz cuadrada del número
        // Cualquier divisor mayor tendría un factor más pequeño ya encontrado
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) { // Si es divisible por algún número aparte de 1 y sí mismo
                return false; // No es primo
            }
        }
        return true; // Si no encontró divisores, es primo
    }

    /**
     * Muestra todos los números pares en el arreglo.
     * @param arr El arreglo de números enteros.
     */
    public static void mostrarNumerosPares(int[] arr) {
        System.out.print("\n4. Números pares: ");
        boolean hayPares = false;
        for (int numero : arr) { // Usamos un bucle for-each para recorrer el arreglo
            if (numero % 2 == 0) { // Si el residuo de la división por 2 es 0, es par
                System.out.print(numero + " ");
                hayPares = true;
            }
        }
        if (!hayPares) {
            System.out.print("No hay números pares en este arreglo.");
        }
        System.out.println(); // Salto de línea al final
    }

    /**
     * Muestra el arreglo ordenado de forma ascendente.
     * @param arr El arreglo de números enteros.
     */
    public static void mostrarArregloAscendente(int[] arr) {
        Arrays.sort(arr); // Ordena el arreglo de forma ascendente
        System.out.println("\n5. Arreglo en orden ascendente: " + Arrays.toString(arr));
    }

    /**
     * Muestra el promedio de los números en el arreglo.
     * @param arr El arreglo de números enteros.
     */
    public static void mostrarPromedioArreglo(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("El arreglo está vacío o es nulo, no se puede calcular el promedio.");
            return;
        }
        long suma = 0; // Usamos long para evitar desbordamiento si la suma es muy grande
        for (int numero : arr) {
            suma += numero;
        }
        // Realizamos la división con double para obtener decimales
        double promedio = (double) suma / arr.length;
        // Formateamos el promedio a dos decimales
        System.out.printf("\n6. El promedio del arreglo es: %.2f%n", promedio);
    }

    /**
     * Muestra la suma del primer y último elemento del arreglo.
     * @param arr El arreglo de números enteros.
     */
    public static void mostrarSumaPrimerUltimo(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("\n7. El arreglo es nulo o tiene menos de dos elementos para sumar.");
            return;
        }
        int suma = arr[0] + arr[arr.length - 1]; // arr.length - 1 es el índice del último elemento
        System.out.println("\n7. La suma del primer y último elemento es: " + suma);
    }

    /**
     * Verifica si el número 100 existe en el arreglo y muestra un mensaje.
     * @param arr El arreglo de números enteros.
     */
    public static void verificarExistenciaCien(int[] arr) {
        boolean existeCien = false;
        for (int numero : arr) {
            if (numero == 100) {
                existeCien = true;
                break; // Podemos salir del bucle una vez que lo encontramos
            }
        }
        if (existeCien) {
            System.out.println("\n8. ¡Existe cien!");
        } else {
            System.out.println("\n8. No se encontró el número 100 en el arreglo.");
        }
    }
}
