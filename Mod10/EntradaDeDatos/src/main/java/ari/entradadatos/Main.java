package ari.entradadatos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es tu nombre? ");
        String nombre = scanner.nextLine();
        // Edad
        System.out.println("Cual es tu edad? ");
        // int edad = Integer.parseInt(scanner.nextLine());
        int edad2 = scanner.nextInt();
        // Altura
        System.out.println("Cual es tu altura? ");
        float altura = scanner.nextFloat();

        // Boolean
        // System.out.println("Está bueno el curso?");
        // boolean valor = scanner.nextBoolean();

        scanner.nextLine(); // Captura el salto de netFloat

        System.out.println("Está bueno el curso? (si/no)");
        boolean valor2 = scanner.nextLine().equals("si");

        System.out.println("Hola " + nombre + " y tienes " + edad2 + " años y " + altura + " " + valor2);

        scanner.close();

        // JOptionPane
        String nombreJOption = JOptionPane.showInputDialog(null, "Cual es tu nombre?");
        int edadJOption = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es tu edad?"));

        String msj = "Hola " + nombreJOption + " con una edad de " + edadJOption;
        JOptionPane.showMessageDialog(null, msj);

        System.out.println("El nombre desde jOption es: " + nombreJOption +  " edad: " + edadJOption);
    }
}
