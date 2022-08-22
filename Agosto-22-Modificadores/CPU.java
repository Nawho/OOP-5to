public class CPU extends Componente{
    private float speed;

    public CPU(String nombre, String nombreFabricante, String modelo, double precio, int stock, int speed) {
        super(nombre, nombreFabricante, modelo, precio, stock);
        this.speed = speed;
    }
}
