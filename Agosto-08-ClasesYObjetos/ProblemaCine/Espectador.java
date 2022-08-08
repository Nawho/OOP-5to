package ProblemaCine;

public class Espectador {
    private String nombre;
    private int edad;
    private double dinero;

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public Espectador() {
        this.nombre = "nombre";
        this.edad = 18;
        this.dinero = 500;
    }
}
