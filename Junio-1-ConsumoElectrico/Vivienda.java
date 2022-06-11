import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Vivienda {
    private String direccion;
    private String tipoDeVivienda;
    private Propietario propietario;

    private HashMap<String, Float> consumosPorMes;

    public Vivienda() {
        this.direccion = "Av. de los Constituyentes 5880";
        this.tipoDeVivienda = "Empresa";
        this.propietario = new Propietario();
    }

    public Vivienda(String direccion, String tipoDeVivienda, Propietario propietario) {
        this.direccion = direccion;
        this.tipoDeVivienda = tipoDeVivienda;
        this.propietario = propietario;
    }

    public String getTipoDeVivienda() {
        return tipoDeVivienda;
    }
    public HashMap<String, Float> getConsumosPorMes() {
        return consumosPorMes;
    }

    public void insertarConsumoEnMes(LocalDate fechaFacturacion, float consumoDelMes){
        String fechaFactura = String.format("%d-%s", fechaFacturacion.getYear(), fechaFacturacion.getMonth().toString());
        if (!this.consumosPorMes.containsKey(fechaFactura)) consumosPorMes.put(fechaFactura, consumoDelMes);
        else System.out.println("Ya se realizo la factura de este mes.");
    }
}
