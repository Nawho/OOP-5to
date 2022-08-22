import java.util.ArrayList;

public class Cliente extends Persona {
    private ArrayList<Integer> carrito;
    private Tarjeta tarjeta;

    public Cliente(String nombre, String apellido, String direccion, String genero, int edad, int DNI, int telefono, int celular) {
        super(nombre, apellido, direccion, genero, edad, DNI, telefono, celular);
        this.carrito = new ArrayList<>();
    }

    public ArrayList<Integer> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Integer> carrito) {
        this.carrito = carrito;
    }

    public void agregarAlCarrito(Integer id) {
        carrito.add(id);
    }

    public void removerDelCarrito(Integer id) {
        carrito.remove(id);
    }

    public void vaciarCarrito() {
        for (Integer c: carrito) {
            carrito.remove(c);
        }
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
}
