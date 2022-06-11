public class Persona {
    private String nombre;
    private int DNI;

    public Persona(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public Persona() {
        this.nombre = "Carlos :D";
        this.DNI = 1010101010;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
}
