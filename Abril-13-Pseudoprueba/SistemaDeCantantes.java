import java.util.ArrayList;

public class SistemaDeCantantes {
    private ArrayList<Cantante> cantantes;

    public SistemaDeCantantes() {
        this.cantantes = new ArrayList<>();
    }

    public ArrayList<Cantante> obtenerCantantesJovenes() {
        ArrayList<Cantante> cantantesJovenes = new ArrayList<>();
        for(Cantante c : cantantes) {
            if(c.esUnAdultoJoven()){
                cantantesJovenes.add(c);
            }
        }
        return cantantesJovenes;
    }

    public void agregarCancion(String nombreArtistico, String nombreCancion, int duracionEnSeg) {
        for(Cantante c : cantantes) {
            if(c.getNombreArtistico().equals(nombreArtistico)) {
                c.agregarCancion(nombreCancion, duracionEnSeg);
            }
        }
    }
}
