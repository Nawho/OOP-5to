import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Sistema sistema = new Sistema(empresa);

        Empleado jorge = new Empleado();
        empresa.addEmpleado(jorge);

        HashMap<LocalDate, LocalTime> entradasDeJorge = new HashMap<>();
        entradasDeJorge.put(LocalDate.now(), LocalTime.now());
        entradasDeJorge.put(LocalDate.of(2022, 5, 10), LocalTime.of(8, 15 ,0));
        entradasDeJorge.put(LocalDate.of(2022, 5, 11), LocalTime.now());
        entradasDeJorge.put(LocalDate.of(2022, 5, 12), LocalTime.now());
        entradasDeJorge.put(LocalDate.of(2022, 5, 13), LocalTime.now());

        jorge.setIngresosDiarios(entradasDeJorge);

        sistema.tablaAsistencia();


    }
}
