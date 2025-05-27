package ari.clases;

public class Usuario {
    public String username;
    private String password;

    // Default - Public - Private - Protected

    // Constructor
    public Usuario() {
        this.username = "";
        this.password = "";
    }

    public Usuario(String user) {
        this.username = user;
        this.password = "";
    }

    public Usuario(String user, String pass) {
        this.username = user;
        this.password = pass;
    }

    public void saluda() {
        System.out.println("Hola, mi usuario es: " + this.username);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void establecerRol() {
        Administrador admin = new Administrador();
        admin.trabajar();
    }

    public class Administrador {
        public void trabajar() {
            System.out.println("El administrador " + username + " se encuentra trabajando.");
        }
    }
}
