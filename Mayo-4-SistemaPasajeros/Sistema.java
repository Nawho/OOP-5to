import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private ArrayList<Pasajero> pasajerosPresentes;
    private ArrayList<Pasajero> historialDePasajeros;
    private int linea;

    public Sistema() {
        this.pasajerosPresentes = new ArrayList<>();
        this.historialDePasajeros = new ArrayList<>();
        this.linea = 314;
    }

    public Sistema(ArrayList<Pasajero> pasajerosPresentes, ArrayList<Pasajero> historialDePasajeros, int linea) {
        this.pasajerosPresentes = pasajerosPresentes;
        this.historialDePasajeros = historialDePasajeros;
        this.linea = linea;
    }

    public void subePasajero(Pasajero pj, Viaje viaje) {
        if(pj.getSaldoReal() >= viaje.getPrecio()) {
            System.out.println("Bienvenido");
            this.pasajerosPresentes.add(pj);
            this.historialDePasajeros.add(pj);
            pj.getTarjeta().realizarViaje(viaje);
        }
        else System.out.println("Saldo insuficiente");
    }

    public void seBajaPasajero(Pasajero pj) {
        this.pasajerosPresentes.remove(pj);
    }

    public HashSet<Pasajero> pasajerosQueSeHanSubidoAlgunaVez() {
        return new HashSet<>(this.historialDePasajeros);
    }

    public HashMap<Pasajero, Float> pasajerosConUltimoMontoAbonado() {
        HashMap<Pasajero, Float> pjMonto = new HashMap<>();
        for(Pasajero pj : historialDePasajeros){
            pjMonto.put(pj, pj.getUltimoMonto());
        }
        return pjMonto;
    }

    public float ultimoMontoAbonadoPorPasajero(int numeroId) {
        HashMap<Pasajero, Float> pjMonto = pasajerosConUltimoMontoAbonado();
        float ultMonto = 0;
        for(Pasajero pj : historialDePasajeros) {
            if(pj.getTarjeta().getNumeroID() == numeroId) {
                 ultMonto = pjMonto.get(pj);
            }
        }
        return ultMonto;
    }

    public static void a(){
        A a = new A();
        System.out.println(a.toString());
    }

}
