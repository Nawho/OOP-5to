import java.lang.reflect.Array;
import java.util.*;

public class Utils
{
    public static HashMap<ConsumoElectrico, Double> get_precios_por_categoria(ArrayList<Electrodomestico> electrodomesticos) {
        HashMap<ConsumoElectrico, Double> _sumaTotalPorCategoria = new HashMap<>();
        for (ConsumoElectrico ce : ConsumoElectrico.values()) {
            _sumaTotalPorCategoria.put( ce, 0.0 );
        }

        for (Electrodomestico e : electrodomesticos) {
            _sumaTotalPorCategoria.put( e.getClaseConsumo(),
                    _sumaTotalPorCategoria.get(e.getClaseConsumo()) + e.precioFinal()
            );
        }

        return _sumaTotalPorCategoria;
    }

    public static ArrayList<Color> colores_mas_utilizados( ArrayList<Electrodomestico> electrodomesticos ) {
        HashMap<Color, Integer> cantidad_por_color = new HashMap<>();
        for (Color c : Color.values()) { cantidad_por_color.put( c, 0 ); }

        for (Electrodomestico e : electrodomesticos) {
            cantidad_por_color.put( e.color, cantidad_por_color.get(e.color) + 1 );
        }

        ArrayList<Color> colores_en_orden = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Color maxCountColor = Collections.max(cantidad_por_color.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();

            colores_en_orden.add(maxCountColor);
            cantidad_por_color.remove(maxCountColor);
        }

        return colores_en_orden;
    }
}
