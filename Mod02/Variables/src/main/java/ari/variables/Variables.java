package ari.variables;

public class Variables {
    public static void main (String[] args) {
        /**
         * 4 Tipos de datos
         *
         * Enteros
         * Decimales
         * Caracteres
         * Booleanos
         */

        int version;
        version = 8;
        version = 9;

        System.out.println("Version: " + version);

        int versionJava = 10;
        System.out.println("Version Java: " +versionJava);

        // Float
        float versionEspecifica = 9.8f;
        System.out.println("Float: "+ versionEspecifica);

        char letra = 'a';
        char numero = 97;
        System.out.println("letra: "+ letra);
        System.out.println("Numero: " + numero);

        boolean boolTrue = true;
        boolean boolFalse = false;

        System.out.println("Boolean True: " + boolTrue);
        System.out.println("Boolean False: " + boolFalse);

        // Declaración Múltiple
        int variable1 = 1, variable2 = 2, variable3 = 3;

        System.out.println("==Declaración Múltiple==");
        System.out.println("Variable1: " + variable1);
        System.out.println("Variable2: " + variable2);
        System.out.println("Variable3: " + variable3);

        // Constantes
        final float pi = 3.1415f, e = 8.9f;

        System.out.println("Constante Pi: " + pi);
        System.out.println("Constante e: " + e);

    }
}
