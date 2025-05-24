package ari.condicionales;

public class Condicionales {
    public static void main (String[] args) {
        // Condicionales
        String colorLuz = "Amarillo";

        // If
        if (colorLuz.equals("Verde")) {
            System.out.println("Puede continuar");
        } else {
            System.out.println("No puedes continuar porque no está en verde");
        }

        // Else If
        if (colorLuz.equals("Verde")) {
            System.out.println("Verde: Puede continuar");
        } else if(colorLuz.equals("Amarillo")) {
            System.out.println("Amarillo: Alto parcial");
        } else if(colorLuz.equals("Rojo")) {
            System.out.println("Rojo: Alto total");
        } else {
            System.out.println("Color no Válido");
        }

        // Condiciones anidadas
        // El promedio para aprobar es de 7
        int promedio = 6;

        if (promedio >= 7) {
            // El promedio es aprobatorio
            if (promedio == 10) {
                System.out.println("Muchas felicidades");
            } else {
                System.out.println("Felicidades");
            }
        } else {
            // El promedio NO es aprobatorio
            System.out.println("Es necesario repasar bloques");

        }

        // Switch
        String luzColor = "Verde";
        switch (luzColor) {
            case "Verde":
                System.out.println("Verde: Puede continuar");
                break;
            case "Amarillo":
                System.out.println("Amarillo: Alto parcial");
                break;
            case "Rojo":
                System.out.println("Rojo: Alto Total");
                break;
            default:
                System.out.println("Color no Válido");
        }

        char calificación = 'B';
        switch (calificación) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
            case 'C':
                System.out.println("Bien hecho");
                break;
            case 'D':
                System.out.println("Aprobado");
                break;
            case 'F':
                System.out.println("Puedes mejorar");
                break;
            default:
                System.out.println("Calificación no válida");
        }

        // While
        int counter = 0, numero = 1234589;
        while (numero > 0) {
            numero = numero / 10;
            counter++;
        }
        System.out.println("El número posee " + counter + " digitos");

        // Do While
        int counter02 = 1;
        do {
            System.out.println("El contador está en: " + counter02);
            counter02++;
        } while (counter02 < 3);

        // for
        // for (inicializacion; condicion; iteración sentencia que queremos que se ejecuten en cada iteración)
        for (int number = 9, x = 1; x < 11; System.out.println(number * x), x++) {  }

        for (int number = 9, x = 1; x < 11; ) {
            int result = number * x;
            String msj = number + " * " + x + " = " + result;

            System.out.println(msj);
            x++;
        }

        for (int number03=1; number03 < 11; number03++) {
            if(number03 % 2 == 0) {
                System.out.println(number03);
            }
        }

        // Sentencias de saltos
        // break, continue, return

        // Sentencias únicas
        boolean val = true;
        if (val) System.out.println("Es verdadero");

    }
}
