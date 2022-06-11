import java.util.ArrayList;

public class Aula {
    private int numero;
    private ArrayList<Alumno> alumnosIngresados;
    private ArrayList<ArrayList<Integer>> dnisConIngresos;

    private boolean alumnoExiste(ArrayList<IngresosConDNI> dnisConCantIngresos, int DNI) {
        for (IngresosConDNI ingresosConDNI : dnisConCantIngresos) {
            if (ingresosConDNI.getDNI() == DNI) return true;
        }

        return false;
    }

    private ArrayList<IngresosConDNI> dnisConCantIngresos(){
        ArrayList<IngresosConDNI> dnisConIngresos = new ArrayList<>();

        for (Alumno al : alumnosIngresados){
            if (!alumnoExiste(dnisConIngresos, al.getDNI())){
                dnisConIngresos.add(new IngresosConDNI(al.getDNI()));
            }
        }

        return dnisConIngresos;
    }



    public ArrayList<Integer> dnisDeAlumnosIngresantes(){
        ArrayList<Integer> dnisAlumnos = new ArrayList<>();

        for (Alumno al : alumnosIngresados){
            if (dnisAlumnos.contains(al.getDNI())) continue;
            dnisAlumnos.add(al.getDNI());
        }

        return dnisAlumnos;
    }

    public int ingresosDeAlumno(Integer dni){
        for (IngresosConDNI ingConDNI : this.dnisConCantIngresos()){
            if (ingConDNI.getDNI() == dni) return ingConDNI.getIngresos();
        }
        return 0;
    }

    public void mostrarDNIs(ArrayList<Integer> listaDNIS){
        for (Integer dni : listaDNIS) {
            System.out.println("DNI: " + dni);
        }
    }

    private void mostrarIngresosConDNI() {
        for (IngresosConDNI ingresosConDNI : this.dnisConCantIngresos()) {
            System.out.println("DNI: " + ingresosConDNI.getDNI() + ", Ingresos: " + ingresosConDNI.getIngresos());
        }
    }

    private void alumnoConMaxIngresos() {
        int dniConMaxIngresos = 0;
        int maxIngresos = 0;

        for (IngresosConDNI ingresosConDNI : this.dnisConCantIngresos()) {
            if (ingresosConDNI.getIngresos() > maxIngresos) dniConMaxIngresos = ingresosConDNI.getDNI();
        }
    }
}
