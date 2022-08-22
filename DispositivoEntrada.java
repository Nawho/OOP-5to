public class DispositivoEntrada extends Componente {
    private PUERTO conector;
    public DispositivoEntrada(String nombre, String nombreFabricante, String modelo, double precio, int stock, PUERTO conector) {
        super(nombre, nombreFabricante, modelo, precio, stock);
        this.conector = conector;
    }
}
