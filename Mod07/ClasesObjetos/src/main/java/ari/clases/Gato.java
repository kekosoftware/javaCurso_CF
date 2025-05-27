package ari.clases;

public class Gato extends Mascota {
    public Gato(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }

    @Override
    public void dormir() {
        System.out.println("El gato se encuentra durmiendo");
    }
}
