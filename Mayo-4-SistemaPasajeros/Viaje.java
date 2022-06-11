public class Viaje {
    private float precio;
    private String fecha;
    private String hora;

    public Viaje() {
        this.precio = 20;
        this.fecha = "4 de Mayo de 2022";
        this.hora = "16:30";
    }

    public Viaje(float precio, String fecha, String hora) {
        this.precio = precio;
        this.fecha = fecha;
        this.hora = hora;
    }

    public float getPrecio() {
        return precio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return String.format("Hora: %s Fecha: %s Precio %f ", this.hora, this.fecha, this.precio);
    }
}
