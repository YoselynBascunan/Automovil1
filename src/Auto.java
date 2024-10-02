import java.util.Scanner;

class Auto {
    // Atributos
    private String marca;
    private String modelo;
    private String color;
    private int velocidadMaxima;
    private boolean encendido;

    // Constructor
    public Auto(String marca, String modelo, String color, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        this.encendido = false; // El auto comienza apagado
    }

    // Método para encender el auto
    public void encender() {
        if (encendido) {
            System.out.println("No se puede realizar esta acción porque su auto ya se encuentra encendido.");
        } else {
            encendido = true;
            System.out.println("Se ha encendido su auto.");
        }
    }

    // Método para apagar el auto
    public void apagar() {
        if (!encendido) {
            System.out.println("No se puede realizar esta acción porque su auto ya está apagado.");
        } else {
            encendido = false;
            System.out.println("Se ha apagado su auto.");
        }
    }

    // Método para acelerar el auto
    public void acelerar() {
        if (!encendido) {
            System.out.println("No puede acelerar porque su auto está apagado.");
        } else {
            System.out.println("El auto está acelerando hasta su velocidad máxima de " + velocidadMaxima + " km/h.");
        }
    }

    // Método para mostrar información del auto
    public void mostrarInfo() {
        System.out.println("Felicidades por su nuevo Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color
                + ", velocidadMaxima=" + velocidadMaxima + ", encendido=" + encendido + "]");
    }
}

