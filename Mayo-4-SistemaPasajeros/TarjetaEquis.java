import java.util.ArrayList;

public class TarjetaEquis {
    private float saldo;
    private float saldoNegativoMaximo;
    private int numeroID;
    private ArrayList<Viaje> viajes;

    public TarjetaEquis() {
        this.saldo = 0;
        this.saldoNegativoMaximo = -60;
        this.numeroID = 1;
        this.viajes = new ArrayList<>();
    }

    public TarjetaEquis(float saldo, float saldoNegativoMaximo, int numeroID, ArrayList<Viaje> viajes) {
        this.saldo = saldo;
        this.saldoNegativoMaximo = saldoNegativoMaximo;
        this.numeroID = numeroID;
        this.viajes = viajes;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getSaldoNegativoMaximo() {
        return saldoNegativoMaximo;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public ArrayList<Viaje> getViajes() {
        return viajes;
    }

    public void cargarSube(float monto) {
        this.saldo += monto;
    }

    public void realizarViaje(Viaje viaje) {
        this.saldo -= viaje.getPrecio();
        this.viajes.add(viaje);
    }

    public float ultimoMontoAbonado() {
        return this.viajes.get(this.viajes.size() - 1).getPrecio();
    }

    public boolean seSuperaElSaldoNegativo() {
        return !(this.getSaldo() < this.getSaldoNegativoMaximo());
    }

    @Override
    public String toString(){
        StringBuilder infoViajes = new StringBuilder();

        for(Viaje viaje : this.viajes){
            infoViajes.append(viaje.toString()).append("Saldo: ").append(this.getSaldo()).append("\n");
        }

        return infoViajes.toString();
    }

}


//saldo, saldoNegativoMaximo, numeronId, lista "viajes"