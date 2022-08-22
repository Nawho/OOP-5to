import java.util.ArrayList;

public class DispositivoSalida extends Componente {
    ArrayList<PUERTO> puertosValidos;

    public DispositivoSalida(String nombre, String nombreFabricante, String modelo, double precio, int stock, ArrayList<PUERTO> puertosValidos) {
        super(nombre, nombreFabricante, modelo, precio, stock);
        this.puertosValidos = puertosValidos;
    }
}
