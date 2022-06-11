import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Empleado extends Persona {
    private ArrayList<DayOfWeek> diasEnDondeTrabajaSemanalmente;
    private LocalTime horaDeEntrada;
    private LocalTime horaDeSalida;
    private HashMap<LocalDate, LocalTime> ingresosDiarios;
    private int diasLaborales;

    public Empleado(String nombre, String apellido, int telefono, LocalDate fechaDeNacimiento, ArrayList<DayOfWeek> diasEnDondeTrabajaSemanalmente, LocalTime horaDeEntrada, LocalTime horaDeSalida, HashMap<LocalDate, LocalTime> ingresosDiarios) {
        super(nombre, apellido, telefono, fechaDeNacimiento);
        this.diasEnDondeTrabajaSemanalmente = diasEnDondeTrabajaSemanalmente;
        this.horaDeEntrada = horaDeEntrada;
        this.horaDeSalida = horaDeSalida;
        this.ingresosDiarios = ingresosDiarios;
        this.diasLaborales = this.diasEnDondeTrabajaSemanalmente.size() * 4;
    }

    public Empleado() {
        super();
        this.diasEnDondeTrabajaSemanalmente = new ArrayList<DayOfWeek>() {
            {
                add(DayOfWeek.MONDAY);
                add(DayOfWeek.TUESDAY);
                add(DayOfWeek.WEDNESDAY);
                add(DayOfWeek.THURSDAY);
                add(DayOfWeek.FRIDAY);
            }
        };
        this.horaDeEntrada = LocalTime.of(8, 30, 0);
        this.horaDeSalida = LocalTime.of(17, 30, 0);
        this.ingresosDiarios = new HashMap<>();
        this.diasLaborales = this.diasEnDondeTrabajaSemanalmente.size() * 4;
    }

    public ArrayList<DayOfWeek> getdiasEnDondeTrabajaSemanalmente() {
        return diasEnDondeTrabajaSemanalmente;
    }

    public void setdiasEnDondeTrabajaSemanalmente(ArrayList<DayOfWeek> diasEnDondeTrabajaSemanalmente) {
        this.diasEnDondeTrabajaSemanalmente = diasEnDondeTrabajaSemanalmente;
    }

    public LocalTime getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(LocalTime horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public LocalTime getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(LocalTime horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public HashMap<LocalDate, LocalTime> getIngresosDiarios() {
        return ingresosDiarios;
    }

    public void setIngresosDiarios(HashMap<LocalDate, LocalTime> ingresosDiarios) {
        this.ingresosDiarios = ingresosDiarios;
    }

    public int getDiasLaborales() {
        return diasLaborales;
    }
}