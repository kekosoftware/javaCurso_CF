package ari.clases;

public class Perro extends Mascota{
    String nombre;
    String raza;
    int edad;

    public Perro(String nombre, String raza, int edad) {
        super(nombre, raza, edad);
    }

    // Parámetros
    void establecerAtributos(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    @Override
    public void dormir() {
        // super.dormir(); // Super hace referencia a la clase padre
        System.out.println("El perro se encuentra durmiendo");
    }

    void comer() {
        System.out.println("El perro se encuentra comiendo.");
    }

    void ladrar() {
        System.out.println("El perro se encuentra ladranddo.");
    }

}
