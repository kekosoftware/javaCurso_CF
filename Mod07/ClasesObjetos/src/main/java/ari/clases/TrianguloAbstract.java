package ari.clases;

public class TrianguloAbstract extends Figura {
    private float base;
    private float altura;

    public TrianguloAbstract(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float area() {
        return (base * altura)/2;
    }
}
