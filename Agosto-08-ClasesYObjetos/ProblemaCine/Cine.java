package ProblemaCine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Cine {
    private Pelicula pelicula;
    private float precioEntrada;
    private HashMap<String, Boolean> asientos;

    private HashMap<String, Boolean> incializarAsientos() {
        HashMap<String, Boolean> _asientos = new HashMap<>();
        for (int i=1; i<=4; i++) {
            for (int j=65; j<=73; j++) {
                _asientos.put(String.format("%d%c", i, j), false);
            }
        }
        return _asientos;
    }

    public Cine(Pelicula pelicula, float precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.asientos = incializarAsientos();
    }
    public Cine() {
        this.pelicula = new Pelicula();
        this.precioEntrada = 250;
        this.asientos = incializarAsientos();
    }


    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public float getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public HashMap<String, Boolean> getAsientos() {
        return asientos;
    }

    public void setAsientos(HashMap<String, Boolean> asientos) {
        this.asientos = asientos;
    }



    private boolean permitirEntrada(Espectador espectador) {
        int cantAsientosLibres = (int) this.asientos.entrySet().stream().filter(e -> !e.getValue()).count();

        if (espectador.getEdad() < this.pelicula.getEdadMinima()) {
            System.out.println("No tiene la edad mínima");
            return false;
        } else if (espectador.getDinero() < this.precioEntrada) {
            System.out.println("No pasas, pobre");
            return false;
        } else if (cantAsientosLibres == 0) {
            System.out.println("No hay asientos disponibles");
            return false;
        }

        return true;
    }
    private void asignarAsiento(String nombre) {
        List<Map.Entry<String, Boolean>> asientosLibres = this.asientos.entrySet().stream().filter(e -> !e.getValue()).collect(Collectors.toList());

        Random random = new Random();
        int randIndex = random.nextInt(asientosLibres.size());
        String keyAsiento = asientosLibres.get(randIndex).getKey();
        this.asientos.put(keyAsiento, true);

        System.out.printf("%s tiene el asiento %s \n", nombre, keyAsiento);
    }

    public void ingresoCliente(Espectador espectador) {
        if (permitirEntrada(espectador)) {
            asignarAsiento(espectador.getNombre());
        }
    }

    public static void main(String[] args) {
        Cine _cine = new Cine();
        Espectador pepito = new Espectador();
        Espectador juan = new Espectador("juan", 10, 5000);
        Espectador carlos = new Espectador("carlos", 20, 5);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(juan);
        _cine.ingresoCliente(carlos);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);
        _cine.ingresoCliente(pepito);

    }
}


//(_cine.asientos.entrySet().stream().filter(e -> !e.getValue()).collect(Collectors.toList()).size()
