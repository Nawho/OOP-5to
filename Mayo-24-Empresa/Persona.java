import java.time.LocalDate;
import static java.time.LocalDate.of;

public class Persona {
    private String nombre;
    private String apellido;
    private int telefono;
    private LocalDate fechaDeNacimiento;

    public Persona(String nombre, String apellido, int telefono, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Persona() {
        this.nombre = "Juan";
        this.apellido = "Ramirez";
        this.telefono = 38201984;
        this.fechaDeNacimiento = of(2004, 12, 5);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String obtenerDatos(){
        return this.nombre + " " + this.apellido + " " + this.telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}