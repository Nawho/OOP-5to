package ProblemaCine;

import java.time.LocalTime;

public class Pelicula {
    private String titulo;
    private LocalTime duracion;
    private int edadMinima;
    private String director;

    public Pelicula(String titulo, LocalTime duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public Pelicula() {
        this.titulo = "titulo";
        this.duracion = LocalTime.of(1, 30);
        this.edadMinima = 13;
        this.director = "director";
    }
}

