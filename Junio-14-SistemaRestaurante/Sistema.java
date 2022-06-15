import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Sistema {
    private HashSet<Mozo> mozos;
    private HashSet<Mesa> mesas;
    private ArrayList<Pedido> pedidosActuales;
    private Estadisticas estadisticas;

    private int newPedidoID = 0;


    public Sistema() {
        this.mozos = new HashSet<>();
        this.mesas = new HashSet<>();
        this.pedidosActuales = new ArrayList<>();
        this.estadisticas = new Estadisticas();
    }


    int getNewID() {
        this.newPedidoID++;
        return this.newPedidoID;
    }

    void agregarPedido(LocalDate fecha, int idCliente, int idMesa, String plato) {
        Pedido nuevoPedido = new Pedido(this.getNewID(), idCliente, idMesa, plato);
        this.pedidosActuales.add(nuevoPedido);
        this.estadisticas.registrarPedido(fecha, nuevoPedido);
    }

    void seRetiraCliente(int idCliente) {
        this.pedidosActuales.removeIf(pedido -> pedido.getIdCliente() == idCliente);
    }

    void seLevantaMesa(ArrayList<Integer> clientes) {
        this.pedidosActuales.removeIf(pedido -> clientes.contains(pedido.getIdCliente()));
    }

    Pedido proximoPedido() {
        return pedidosActuales.get(pedidosActuales.size() - 1);
    }

    ArrayList<Integer> mesasQuePidieronPlato(String plato) {
        ArrayList<Integer> mesas = new ArrayList<>();

        for (Mesa mesa : this.mesas) {
            for (Pedido pedido : mesa.getPedidos()) {
                if (pedido.getPlato().equals(plato)) {
                    mesas.add(pedido.getMesa());
                    break;
                }
            }
        }

        return mesas;
    }
}
