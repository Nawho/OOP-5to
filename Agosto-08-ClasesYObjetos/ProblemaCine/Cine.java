package ProblemaCine;

import java.util.HashMap;


public class Cine {
    private Pelicula pelicula;
    private float precioEntrada;
    private HashMap<String, Boolean> asientos;

    //function de inicializar asientos del tipo "3c", "3d", etc 

    public Cine(Pelicula pelicula, float precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.asientos = new HashMap<>();
    }

    public Cine() {
        this.pelicula = new Pelicula();
        this.precioEntrada = 250;
        this.asientos = new HashMap<>();
    }
}
