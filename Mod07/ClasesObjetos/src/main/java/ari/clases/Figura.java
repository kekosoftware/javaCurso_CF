package ari.clases;

public abstract class Figura {
    private int numeroLados;

    public Figura() {
        this.numeroLados = 0;
    }

    public abstract float area(); // Método abastracto
}
