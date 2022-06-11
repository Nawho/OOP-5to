import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Vivienda> viviendas;
    private static int PRECIO_DOMICILIO_PARTICULAR = 2;
    private static int PRECIO_EMPRESA = 3;

    private boolean seAplicaDescuento(Vivienda vivienda, String yearMonth) {
        String[] yearMonthArr = yearMonth.split("-");
        float previousYear = Float.parseFloat(yearMonthArr[0]) - 1;
        String previousYearKey = String.format("%f-%s", previousYear, yearMonthArr[1]);

        return vivienda.getConsumosPorMes().containsKey(previousYearKey);
    }

    public float obtenerConsumoEnMes(Vivienda vivienda, String AñoYMes) {


            if (vivienda.getTipoDeVivienda().equals("domicilio")) {
                return vivienda.getConsumosPorMes().get(AñoYMes) * PRECIO_DOMICILIO_PARTICULAR;
            } else if (vivienda.getTipoDeVivienda().equals("empresa")) {
                return vivienda.getConsumosPorMes().get(AñoYMes) * PRECIO_DOMICILIO_PARTICULAR;
            }

            System.out.println("error, no se encontró el mes en el objeto vivienda");
            return 0.f;
    }
}
