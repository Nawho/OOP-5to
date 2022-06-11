import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Cliente {
    private int edad;
    private int id;
    private String nombre;
    private ArrayList<Libro> librosComprados;
    private HashMap<Integer, Integer> cantDeLibrosDeUnTipo;


    public Cliente() {
        this.edad = 10;
        this.id = 0;
        this.nombre = "Default";
        this.librosComprados = new ArrayList<>();
        cantDeLibrosDeUnTipo = new HashMap<>();
    }

    public void comprarLibro(int l){
        if(cantDeLibrosDeUnTipo.containsKey(l)) this.cantDeLibrosDeUnTipo.put(l, cantDeLibrosDeUnTipo.get(l)+1);
        else this.cantDeLibrosDeUnTipo.put(l, 1);
    }

    public Cliente(int edad, int id, String nombre, ArrayList<Libro> librosComprados) {
        this.edad = edad;
        this.id = id;
        this.nombre = nombre;
        this.librosComprados = librosComprados;
    }

    public HashMap<Integer, Integer> getCantDeLibrosDeUnTipo() {
        return cantDeLibrosDeUnTipo;
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
