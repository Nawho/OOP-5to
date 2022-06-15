import java.util.ArrayList;

public class Pedido {
    private int id;
    private int idCliente;
    private int idMesa;
    private String plato;

    public Pedido(int id, int idCliente, int idMesa, String plato) {
        this.id = id;
        this.idCliente = idCliente;
        this.idMesa = idMesa;
        this.plato = plato;
    }

    public int getId() {
        return this.id;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public String getPlato() {
        return this.plato;
    }

    public int getMesa() {
        return this.idMesa;
    }
}
