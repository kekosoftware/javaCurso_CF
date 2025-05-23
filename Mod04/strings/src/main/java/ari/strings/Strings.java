package ari.strings;

public class Strings {
    public static void main (String[] args) {
        // String es un clase
        System.out.println("Hola soy un string");

        // Variable String
        String mensaje = "Hola soy un String en Variable";
        System.out.println(mensaje);

        // Clase
        String msj2 = new String("msj2 = String desde una clase");
        System.out.println(msj2);

        // Cantidad de caracteres
        int cantidadCaracteres = msj2.length();
        System.out.println("La cantidad de caracteres de msj es: " + cantidadCaracteres);

        // Contain = si contiene un substring
        boolean respContain = msj2.contains("clase");
        System.out.println("La cadena msj2 contiene la palabra clase :" + respContain);

        // starWith = inicia con un string | endWith = finaliza con un string
        String msj3 = "Hola esto es un Mundo";
        boolean respStart = msj3.startsWith("Hola");
        boolean respEnd = msj3.endsWith("Mundo");
        System.out.println("Comienza con hola? "+ respStart + ". Termina con Mundo? " + respEnd);

        // Concat
        String nuevoString = msj3.concat(" con Java");
        System.out.println("String concatenado: " +nuevoString);

        // .toUpperCase(), .toLowerCase(), trim()
        String str01 = "  Hola, soy un String  ";
        System.out.println("String con toUpperCase: " + str01.toUpperCase().trim());
        System.out.println("String con toLowerCase: " + str01.toLowerCase());
        System.out.println("String con trim: " + str01.trim());

        // format
        String str02 = String.format("Bienvenido al curso %s", "JAVA");
        System.out.println("String con format: " + str02);

        // %d = enteros, %f = float, %s = string
        float valor = 10.872040f;
        String str03 = String.format("El total de %d es %.2f %s", 3, valor,"$"); // 2f es la cantidad de decimales
        System.out.println("String con format: " + str03);
        System.out.printf("El total de %d es %.2f %s", 3, valor,"$");

        // 2 string iguales
        String str04 = "Hola";
        String str05 = "Hola";
        boolean resuEqual = str04.equals(str05);
        System.out.println("");
        System.out.println("Cadenas son iguales: " + resuEqual);

        // Concat
        String str06 = "Ari";
        String str07 = "Curso de Java 9";

        String msj01 = "Hola, bienvenido ".concat(str06);
        msj01 = msj01.concat(" al ");
        msj01 = msj01.concat(str07);
        msj01 = msj01.concat(".");
        System.out.println(msj01);


    }
}
