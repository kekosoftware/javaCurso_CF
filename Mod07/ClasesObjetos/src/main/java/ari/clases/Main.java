package ari.clases;

import java.nio.file.attribute.UserPrincipal;

public class Main {
    public static void main(String[] args) {
        // Clases y Objetos
        Perro lassie = new Perro("Lassie", "Collie", 4); // Instancia
        lassie.establecerAtributos("Lassie", "Collie", 4); //Argumentos

//        lassie.nombre = "Lassie";
//        lassie.raza = "Collie";
//        lassie.edad = 4;

        System.out.println("El nombre es: " + lassie.nombre);
        System.out.println("El raza es: " + lassie.raza);
        System.out.println("El edad es: " + lassie.edad);
        sout

        lassie.comer();
        lassie.ladrar();
        lassie.dormir();

        // Triangulo
        Triangulo triangulo = new Triangulo();
        triangulo.base = 10;
        triangulo.altura = 28;
        float resultado = triangulo.area();
        System.out.println("El resultado del area es: " + resultado);

        // Usuario
        Usuario ariel = new Usuario("Ari", "Pass");
//        ariel.username = "Ari";
//        ariel.setPassword("pass");

        System.out.println("El username es: " + ariel.username);
        System.out.println("El password es: " + ariel.getPassword());

        // Calculadora
        Calculadora calculadora = new Calculadora();
        int resuCalInt = calculadora.suma(10, 20, 8, 15, 17);
        float resuCalFloat = calculadora.suma(10.5f, 20.8f);
        double resuCalDouble = calculadora.suma(10.50, 20.80);
        System.out.println("El resultado de la sumaInt es: " + resuCalInt);
        System.out.println("El resultado de la sumaFloat es: " + resuCalFloat);
        System.out.println("El resultado de la sumaDouble es: " + resuCalDouble);

        // Sobrecarga de constructores
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario("Usuario");
        Usuario usuario3 = new Usuario("Usuario", "Pass");

        usuario1.saluda();
        usuario2.saluda();
        usuario3.saluda();

        // Static
        Circulo c = new Circulo(1f);
        System.out.println("El valor de pi es: " + Circulo.pi);
        System.out.println("El valor de pi es: " + c.pi);
        System.out.println("El área del circulo es: " + Circulo.area(123f));

        // Clases Anidadas
        Usuario user = new Usuario("Gus");
        user.establecerRol();

        // Herencia
        Gato gato = new Gato("gato", "raza", 2);
        Perro perro = new Perro("Lassie", "Collie", 4);
        perro.establecerAtributos("perro", "raza", 4);

        gato.dormir();
        perro.dormir();

        //Sustitución
        Circulo circulo = new Circulo(9f);
        TrianguloAbstract triangulo1 = new TrianguloAbstract(10f, 5f);
//        System.out.println("El área del circulo es: " + circulo.area);
        System.out.println("La base del triangulo es: " + triangulo1.area());

    }
}
