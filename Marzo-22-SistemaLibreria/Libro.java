import java.util.ArrayList;
import java.util.Arrays;

public class Libro{
    private int id;
    private float precio;
    private String nombre;
    private String editorial;
    public ArrayList<String> editorialesConDescuento = new ArrayList<>(Arrays.asList("ElAteneo", "Interzona", "Sur", "Alianza"));

    public Libro(int id, float precio, String nombre, String editorial) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
        this.editorial = editorial;
    }

    public int getId() {
        return id;
    }
    public float getPrecio() {return precio; }
    public String getNombre() { return nombre; }
    public String getEditorial() { return editorial; }

    public void cambiarPrecio(float descuento, float precio) {
        this.precio = precio - precio * (descuento / 100);
    }

    public void cambiarPrecio(float descuento) {
        this.precio =  this.precio - this.precio * (descuento / 100.0f);
    }

    public float precioFinal() {
        float montoTotal = 0.f;

        if (Arrays.asList(this.editorialesConDescuento).contains(this.getEditorial())) {
            montoTotal += this.getPrecio() / 2;
        } else {
            montoTotal += this.getPrecio();
        }

        return montoTotal;
    }
}
