import java.math.*;
public class Pasajero {
    private String nombre;
    private String apellido;
    private TarjetaEquis tarjeta;

    public Pasajero() {
        this.nombre = "anónimo";
        this.apellido = "anónimo";
        this.tarjeta = new TarjetaEquis();
    }

    public Pasajero(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = new TarjetaEquis();
    }

    public Pasajero(String nombre, String apellido, TarjetaEquis tarjeta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tarjeta;
    }

    public TarjetaEquis getTarjeta() {
        return tarjeta;
    }

    public String getApellido() {
        return apellido;
    }

    public float getSaldoReal() {
        return tarjeta.getSaldo() + Math.abs(tarjeta.getSaldoNegativoMaximo());
    }

    public float getUltimoMonto(){
        return this.tarjeta.ultimoMontoAbonado();
    }

    @Override
    public String toString(){
        return String.format("Nombre: %s\n Apellido: %s\n %s", this.nombre, this.apellido, this.tarjeta.toString());
    }
}
