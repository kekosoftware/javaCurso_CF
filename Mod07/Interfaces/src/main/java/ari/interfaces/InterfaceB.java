package ari.interfaces;

public interface InterfaceB {
    public void mostrarMensaje();

    public default void saludo() {
        System.out.println("Hola Mundo desde una interface!");
    }
}
