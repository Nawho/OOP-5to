import java.util.ArrayList;

public class Compra {
    private ArrayList<Integer> carrito;
    private char metodoPago;

    private Tarjeta tarjeta;
    public Compra(ArrayList<Integer> carrito, char metodoPago) {
        this.carrito = carrito;
        this.metodoPago = metodoPago;
    }

    public Compra(ArrayList<Integer> carrito, char metodoPago, Tarjeta tarjeta) {
        this.carrito = carrito;
        this.metodoPago = metodoPago;
        this.tarjeta = tarjeta;
    }

    public ArrayList<Integer> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Integer> carrito) {
        this.carrito = carrito;
    }

    public char getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(char metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
}
