package ari.arreglos;

public class EjercicioMatriz {
    public static void main(String[] args) {
        final int FILAS = 5;    // Definimos el número de filas
        final int COLUMNAS = 5; // Definimos el número de columnas

        // 1. Crear una matriz de 5 x 5
        int[][] matriz = new int[FILAS][COLUMNAS];
        System.out.println("1. Matriz de " + FILAS + "x" + COLUMNAS + " creada.");

        // 2. Llenar la matriz con números aleatorios (entre 0 y 99)
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = (int)(Math.random() * 100); // Números entre 0 y 99
            }
        }
        System.out.println("2. Matriz llenada con números aleatorios.");

        // Opcional: Mostrar la matriz inicial para depuración
        System.out.println("\n--- Matriz Generada ---");
        imprimirMatriz(matriz);
        System.out.println("------------------------");


        // A partir de la matriz anteriormente creada:

        // 3. Mostrar en consola el promedio de la matriz.
        mostrarPromedioMatriz(matriz);

        // 4. Mostrar en consola el número mayor y la cantidad de veces que este se repite.
        mostrarMayorYFrecuencia(matriz);

        // 5. Mostrar en consola todos los números primos.
        mostrarNumerosPrimos(matriz);

        // 6. Mostrar en consola todos los números pares.
        mostrarNumerosPares(matriz);

        // 7. Mostrar en consola la suma de las diagonales.
        mostrarSumaDiagonales(matriz);

        // 8. Mostrar en consola la suma de la la última fila.
        mostrarSumaUltimaFila(matriz);

        // 9. Mostrar en consola el mensaje "Cuadrado Mágico" si la matriz cataloga como un cuadrado mágico.
        // Nota: Un cuadrado mágico es poco probable con números aleatorios.
        verificarCuadradoMagico(matriz);
    }

    /**
     * Imprime el contenido de la matriz de forma legible.
     * @param matriz La matriz a imprimir.
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]); // Formato para alinear números
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }

    /**
     * Muestra el promedio de todos los números en la matriz.
     * @param matriz La matriz de números enteros.
     */
    public static void mostrarPromedioMatriz(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            System.out.println("\n3. La matriz está vacía o es nula, no se puede calcular el promedio.");
            return;
        }

        long sumaTotal = 0;
        int cantidadElementos = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaTotal += matriz[i][j];
                cantidadElementos++;
            }
        }

        // Realizamos la división con double para obtener decimales
        double promedio = (double) sumaTotal / cantidadElementos;
        System.out.printf("\n3. El promedio de la matriz es: %.2f%n", promedio);
    }

    /**
     * Muestra el número mayor en la matriz y cuántas veces se repite.
     * @param matriz La matriz de números enteros.
     */
    public static void mostrarMayorYFrecuencia(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            System.out.println("\n4. La matriz está vacía o es nula.");
            return;
        }

        int mayor = matriz[0][0]; // Asumimos que el primer elemento es el mayor inicialmente
        int contadorMayor = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j]; // Encontramos un nuevo mayor
                    contadorMayor = 1;     // Reiniciamos el contador
                } else if (matriz[i][j] == mayor) {
                    contadorMayor++;       // Encontramos otra ocurrencia del mayor actual
                }
            }
        }
        System.out.println("\n4. El número mayor es: " + mayor);
        System.out.println("   Se repite: " + contadorMayor + " veces.");
    }

    /**
     * Muestra todos los números pares en la matriz.
     * @param matriz La matriz de números enteros.
     */
    public static void mostrarNumerosPares(int[][] matriz) {
        System.out.print("\n6. Números pares en la matriz: ");
        boolean hayPares = false;
        for (int[] fila : matriz) { // Recorremos fila por fila
            for (int celda : fila) { // Recorremos celda por celda en la fila actual
                if (celda % 2 == 0) {
                    System.out.print(celda + " ");
                    hayPares = true;
                }
            }
        }
        if (!hayPares) {
            System.out.print("No hay números pares en esta matriz.");
        }
        System.out.println();
    }

    /**
     * Muestra todos los números primos en la matriz.
     * @param matriz La matriz de números enteros.
     */
    public static void mostrarNumerosPrimos(int[][] matriz) {
        System.out.print("\n5. Números primos en la matriz: ");
        boolean hayPrimos = false;
        for (int[] fila : matriz) {
            for (int celda : fila) {
                if (esPrimo(celda)) { // Reutilizamos la función esPrimo del ejercicio anterior
                    System.out.print(celda + " ");
                    hayPrimos = true;
                }
            }
        }
        if (!hayPrimos) {
            System.out.print("No hay números primos en esta matriz.");
        }
        System.out.println();
    }

    /**
     * Verifica si un número dado es primo.
     * (Función auxiliar reutilizada del ejercicio anterior)
     * @param num El número a verificar.
     * @return true si el número es primo, false en caso contrario.
     */
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Muestra la suma de las diagonales principal y secundaria de la matriz.
     * Solo para matrices cuadradas.
     * @param matriz La matriz de números enteros.
     */
    public static void mostrarSumaDiagonales(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0 || matriz.length != matriz[0].length) {
            System.out.println("\n7. La matriz no es cuadrada o está vacía, no se pueden sumar las diagonales.");
            return;
        }

        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        int n = matriz.length; // Tamaño de la matriz cuadrada

        // Suma de la diagonal principal (i == j)
        // Elementos: matriz[0][0], matriz[1][1], matriz[2][2], etc.
        for (int i = 0; i < n; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
        }

        // Suma de la diagonal secundaria (i + j == n - 1)
        // Elementos: matriz[0][n-1], matriz[1][n-2], etc.
        for (int i = 0; i < n; i++) {
            sumaDiagonalSecundaria += matriz[i][n - 1 - i];
        }

        System.out.println("\n7. Suma de la Diagonal Principal: " + sumaDiagonalPrincipal);
        System.out.println("   Suma de la Diagonal Secundaria: " + sumaDiagonalSecundaria);
    }

    /**
     * Muestra la suma de la última fila de la matriz.
     * @param matriz La matriz de números enteros.
     */
    public static void mostrarSumaUltimaFila(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            System.out.println("\n8. La matriz está vacía o es nula, no se puede sumar la última fila.");
            return;
        }

        int ultimaFilaIndex = matriz.length - 1; // El índice de la última fila
        int sumaUltimaFila = 0;

        // Recorremos solo los elementos de la última fila
        for (int j = 0; j < matriz[ultimaFilaIndex].length; j++) {
            sumaUltimaFila += matriz[ultimaFilaIndex][j];
        }
        System.out.println("\n8. Suma de la última fila (" + ultimaFilaIndex + "): " + sumaUltimaFila);
    }

    /**
     * Verifica si la matriz es un "Cuadrado Mágico".
     * Un cuadrado mágico es una matriz cuadrada donde la suma de los números
     * de cada fila, cada columna y ambas diagonales es la misma.
     * Nota: Muy poco probable con números aleatorios.
     * @param matriz La matriz a verificar.
     */
    public static void verificarCuadradoMagico(int[][] matriz) {
        System.out.print("\n9. Verificando Cuadrado Mágico... ");

        if (matriz == null || matriz.length == 0 || matriz[0].length == 0 || matriz.length != matriz[0].length) {
            System.out.println("La matriz no es cuadrada. No es un Cuadrado Mágico.");
            return;
        }

        int n = matriz.length;
        int sumaReferencia = 0; // La suma que todas las filas, columnas y diagonales deben igualar

        // Calcular la suma de la primera fila para usarla como referencia
        for (int j = 0; j < n; j++) {
            sumaReferencia += matriz[0][j];
        }

        // Verificar sumas de filas
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaReferencia) {
                System.out.println("No es un Cuadrado Mágico (la fila " + i + " no suma lo mismo).");
                return;
            }
        }

        // Verificar sumas de columnas
        for (int j = 0; j < n; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaReferencia) {
                System.out.println("No es un Cuadrado Mágico (la columna " + j + " no suma lo mismo).");
                return;
            }
        }

        // Verificar suma de diagonal principal
        int sumaDiagonalPrincipal = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
        }
        if (sumaDiagonalPrincipal != sumaReferencia) {
            System.out.println("No es un Cuadrado Mágico (la diagonal principal no suma lo mismo).");
            return;
        }

        // Verificar suma de diagonal secundaria
        int sumaDiagonalSecundaria = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonalSecundaria += matriz[i][n - 1 - i];
        }
        if (sumaDiagonalSecundaria != sumaReferencia) {
            System.out.println("No es un Cuadrado Mágico (la diagonal secundaria no suma lo mismo).");
            return;
        }

        // Si todas las verificaciones pasaron
        System.out.println("¡Es un Cuadrado Mágico!");
        System.out.println("La suma mágica es: " + sumaReferencia);
    }
}
