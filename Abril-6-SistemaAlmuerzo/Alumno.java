public class Alumno extends Persona{
    private int curso;
    private int nroDeLegajo;
    private String orientacion;

    public Alumno() {
        super();
        this.curso = 5;
        this.nroDeLegajo = 100;
        this.orientacion = "Computacion";
    }

    public Alumno(String nombre, String direccion, int edad, int dni, int telefono, int curso, int nroDeLegajo, String orientacion){
        super(nombre, direccion, edad, dni, telefono);
        this.curso = curso;
        this.nroDeLegajo = nroDeLegajo;
        this.orientacion = orientacion;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getNroDeLegajo() {
        return nroDeLegajo;
    }

    public void setNroDeLegajo(int nroDeLegajo) {
        this.nroDeLegajo = nroDeLegajo;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }
}
