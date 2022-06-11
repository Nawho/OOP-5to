import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> EmpleadosActuales;

    public Empresa() {
        this.EmpleadosActuales = new ArrayList<>();
    }

    public ArrayList<Empleado> getEmpleadosActuales() {
        return EmpleadosActuales;
    }

    public void setEmpleadosActuales(ArrayList<Empleado> EmpleadosActuales) {
        this.EmpleadosActuales = EmpleadosActuales;
    }

    public void addEmpleado(Empleado pj)
    {
        EmpleadosActuales.add(pj);
    }

    public int getCantEmpleados(){
        return this.getEmpleadosActuales().size();
    }
}
