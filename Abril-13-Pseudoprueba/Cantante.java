import java.util.ArrayList;

public class Cantante extends Persona{
    private String nombreArtistico;
    private ArrayList<Cancion> canciones;

    public Cantante() {
        super();
        this.nombreArtistico = "";
        this.canciones = new ArrayList<>();
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }
    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public ArrayList<Cancion> obtenerCancionesMasLargas() {
        ArrayList<Cancion> cancionesMasLargas = new ArrayList<>();
        for(Cancion c : canciones){
            if(c.esCancionLarga()){
                cancionesMasLargas.add(c);
            }
        }
        return cancionesMasLargas;
    }

    public void agregarCancion(String nombreCancion, int duracionEnSeg){
        Cancion c = new Cancion(nombreCancion, duracionEnSeg);
        canciones.add(c);
    }

    public static void main(String[] args){
        Cantante cant1 = new Cantante();
        cant1.setNombreArtistico("Gustavo Cerati");
        System.out.println(cant1.getNombreArtistico());
    }
}
