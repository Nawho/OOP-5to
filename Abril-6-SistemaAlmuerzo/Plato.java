public class Plato {
    private int Precio;
    private String Nombre;

    public Plato() {
        this.Precio = 250;
        this.Nombre = "Pebete";
    }

    public Plato(int precio, String nombre) {
        this.Precio = precio;
        this.Nombre = nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio() {
        Precio = 300;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
