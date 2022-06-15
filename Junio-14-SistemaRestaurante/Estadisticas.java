import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Estadisticas {
    ArrayList<Pedido> historialPedidos;
    HashMap<LocalDate, HashMap<String, HashMap<String, Integer>>> estadisticasPorDia;

    public Estadisticas() {
        this.estadisticasPorDia = new HashMap<>();
    }

    void registrarPedido(LocalDate fecha, Pedido pedido) {
        this.estadisticasPorDia
                .get(fecha)
                .get("mesasOcupadas")
                .merge("Mesa" + pedido.getMesa(), 1, (oldValue, newValue) -> oldValue++);

        this.estadisticasPorDia
                .get(fecha)
                .get("platosPedidos")
                .merge(pedido.getPlato(), 1, (oldValue, newValue) -> oldValue++);

        this.historialPedidos.add(pedido);
    }

    private List<String> keysOfMaxOrMinValues(HashMap<String, Integer> platosPedidos, int min_o_max) {
        return platosPedidos.keySet().stream()
                .filter(key -> platosPedidos.get(key) == min_o_max)
                .toList();
    }


    List<String> mostrarPlatosMasPedidosEnDia(LocalDate fecha) {
        HashMap<String, Integer> platosPedidos = this.estadisticasPorDia.get(fecha).get("platosPedidos");
        int max = Collections.max(platosPedidos.values());

        return keysOfMaxOrMinValues(platosPedidos, max);
    }

    List<String> mostrarPlatosMenosPedidosEnDia(LocalDate fecha) {
        HashMap<String, Integer> platosPedidos = this.estadisticasPorDia.get(fecha).get("platosPedidos");
        int min = Collections.min(platosPedidos.values());

        return keysOfMaxOrMinValues(platosPedidos, min);
    }

    List<String> mesasMasOcupadasEnDia(LocalDate fecha) {
        HashMap<String, Integer> mesasOcupadas = this.estadisticasPorDia.get(fecha).get("mesasOcupadas");
        int max = Collections.max(mesasOcupadas.values());

        return keysOfMaxOrMinValues(mesasOcupadas, max);
    }
}
