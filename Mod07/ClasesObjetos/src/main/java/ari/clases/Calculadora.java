package ari.clases;

public class Calculadora {
    // los 3 puntos indica que puede recibir n parametros
    public int suma(int... numeros) {
        int suma = 0;
        System.out.println("numero es: " + numeros.length);
        for (int numero: numeros) {
            suma +=numero;
        }
        return suma;
    }

    // int
    public int suma(int val01, int val02) {
        return val01 + val02;
    }

    public int suma(int val01, int val02, int val03) {
        return val01 + val02 + val03;
    }

    // float
    public float suma(float... numeros) {
        float suma = 0.0f;
        for (float numero: numeros) {
            suma +=numero;
        }
        return suma;
    }

    // double
    public double suma(double... numeros) {
        double suma = 0;
        for (double numero: numeros) {
            suma +=numero;
        }
        return suma;
    }
}
