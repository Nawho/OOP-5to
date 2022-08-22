import java.util.ArrayList;

public class Impresora extends DispositivoSalida{
    private String tipoDeImpresion;

    public Impresora(String nombre, String nombreFabricante, String modelo, double precio, int stock, ArrayList<PUERTO> puertosValidos, String tipoDeImpresion) {
        super(nombre, nombreFabricante, modelo, precio, stock, puertosValidos);
        this.tipoDeImpresion = tipoDeImpresion;
    }
}
