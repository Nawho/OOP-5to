import java.util.ArrayList;
import java.util.Arrays;

public class Cliente {
    private int edad;
    private int id;
    private String nombre;
    private ArrayList<Libro> librosComprados;

    public Cliente() {
        this.edad = 10;
        this.id = 0;
        this.nombre = "Default";
        this.librosComprados = null;
    }

    public Cliente(int edad, int id, String nombre, ArrayList<Libro> librosComprados) {
        this.edad = edad;
        this.id = id;
        this.nombre = nombre;
        this.librosComprados = librosComprados;
    }

    public int getId() { return id; }
    public int getEdad() { return edad; }

    public ArrayList<Libro> getLibroscomprados() { return librosComprados; }
    public int getLibroscompradosSize() { return librosComprados.size(); }


    public float calcularPrecioFinalLibros(){
        float precioFinal = 0.f;

        for (Libro l : librosComprados){
            precioFinal += l.precioFinal();
        }

        return precioFinal;
    }

    public void agregarLibroComprado(Libro l) {
        this.librosComprados.add(l);
    }


}
