public class Persona {
    private String nombre;
    private String apellido;
    private String direccion;
    private String genero;
    private int edad;
    private int DNI;
    private int telefono;
    private int celular;

    public Persona(String nombre, String apellido, String direccion, String genero, int edad, int DNI, int telefono, int celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.genero = genero;
        this.edad = edad;
        this.DNI = DNI;
        this.telefono = telefono;
        this.celular = celular;
    }

    public Persona() {
        this.nombre = "nombre";
        this.apellido = "apellido";
        this.direccion = "direccion";
        this.genero = "genero";
        this.edad = 10;
        this.DNI = 1000;
        this.telefono = 12345678;
        this.celular = 987654321;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
}
