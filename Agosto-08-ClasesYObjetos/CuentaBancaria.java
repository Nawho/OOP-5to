import java.util.HashMap;
import java.util.HashMap;

public class CuentaBancaria {
    private String nombre;
    private int numeroCliente;
    private double tipoDeInteres;
    private double saldoDisponible;

    private HashMap<Integer, CuentaBancaria> contactos;


    public CuentaBancaria(String nombre, int numeroCliente, double tipoDeInteres, double saldoDisponible) {
        this.nombre = nombre;
        this.numeroCliente = numeroCliente;
        this.tipoDeInteres = tipoDeInteres;
        this.saldoDisponible = saldoDisponible;
        this.contactos = new HashMap<>();
    }

    public CuentaBancaria() {
        this.nombre = "";
        this.numeroCliente = 0;
        this.tipoDeInteres = 0;
        this.saldoDisponible = 0;
        this.contactos = new HashMap<>();
    }

    public CuentaBancaria(String nombre) {
        this.nombre = nombre;
        this.numeroCliente = 0;
        this.tipoDeInteres = 0;
        this.saldoDisponible = 0;
        this.contactos = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }


    public boolean saldoDisponible(double monto){
        return this.saldoDisponible >= monto;
    }

    public boolean cuentaAgendada(int nroCuenta) {
        return this.contactos.containsKey(nroCuenta);
    }

    public void agregarContacto(CuentaBancaria cuenta) {
        this.contactos.put(cuenta.getNumeroCliente(), cuenta);
    }

    public void extraer(double monto) {
        if (!saldoDisponible(monto)) {
            System.out.println("No tiene los fondos necesarios para realizar esta extracción");
        } else {
            this.saldoDisponible -= monto;
            System.out.println("Extracción realizada con éxito.");
        }
    }

    public void depositar(double monto) {
        this.saldoDisponible += monto;
        System.out.println("Deposito realizado con éxito");
    }

    public void transferencia(double monto, int nroCliente) {
        if(!saldoDisponible(monto)) {
            System.out.println("No tiene los fondos necesarios para realizar esta transferencia");
            return;
        }

        if(!cuentaAgendada(nroCliente)) {
            System.out.println("La cuenta no está en la lista de contactos");
            return;
        }

        extraer(monto + (monto * getTipoDeInteres() / 100));
        this.contactos.get(nroCliente).depositar(monto);
    }
}
