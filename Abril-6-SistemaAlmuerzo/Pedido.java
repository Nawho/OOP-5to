import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido extends Plato{
    private LocalDate fechaPedido;
    private LocalTime horaDeEntrega;
    private String nombreAlumno;
    private boolean entregado;

    public Pedido() {
        super();
        this.fechaPedido = LocalDate.now();
        this.horaDeEntrega = LocalTime.of(12, 45, 0);
        this.nombreAlumno = "Nicolas";
        this.entregado = false;
    }

    public Pedido(LocalTime horaDeEntrega, String nombreAlumno, String nombrePlato, int Precio, String plato) {
        super(Precio, plato);
        this.fechaPedido = LocalDate.now();
        this.horaDeEntrega = horaDeEntrega;
        this.nombreAlumno = nombreAlumno;
        this.entregado = false;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public LocalTime getHoraDeEntrega() {
        return horaDeEntrega;
    }

    public void setHoraDeEntrega(LocalTime horaDeEntrega) {
        this.horaDeEntrega = horaDeEntrega;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
}
