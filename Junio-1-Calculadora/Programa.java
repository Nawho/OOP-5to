import java.util.ArrayList;
import java.util.HashMap;

public class Programa {
    private HashMap<String, ArrayList<Instruccion>> rutinas;

    public Programa() {
        this.rutinas = new HashMap<>();
    }


    public void agregarInstruccion(String nombreRutina, Instruccion instruccion) {
        if (rutinas.containsKey(nombreRutina)) rutinas.get(nombreRutina).add(instruccion);
        else rutinas.put(nombreRutina, new ArrayList<>(){{ add(instruccion); }});
    }


    public HashMap<String, ArrayList<Instruccion>> getRutinas() {
        return rutinas;
    }
}
