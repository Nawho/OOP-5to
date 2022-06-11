public class Hijo extends Persona {
    private String juegoFavorito;
    private String escuela;

    Hijo() {
        super();
        this.juegoFavorito = "Stardew Valley";
        this.escuela = "IPM";
    }

    Hijo(String nombre) {
        super(nombre);
        this.juegoFavorito = "Stardew Valley";
        this.escuela = "IPM";
    }

    Hijo(String nombre, String direccion, int edad, int dni, int telefono, String juegoFavorito, String escuela) {
     super(nombre, direccion, edad, dni, telefono);
     this.juegoFavorito = juegoFavorito;
     this.escuela = escuela;
    }
}
