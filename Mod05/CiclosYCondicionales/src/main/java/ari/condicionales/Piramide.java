package ari.condicionales;

public class Piramide {
    public static void printPyramids (int rows) {
        // rows
        for (int i=0; i < rows; i++) {
            // print blank spaces
            for (int j=0; j < rows - 1 - i; j++) {
                System.out.print(" ");
            }

            // print asterisks, increment in 2 each rows
            for (int k=0; k < 1 + 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        printPyramids(5);
    }
}
