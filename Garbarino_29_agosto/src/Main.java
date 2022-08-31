import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        Electrodomestico e1 = new Lavarropa(5000, 60, ConsumoElectrico.C, Color.NEGRO, 10);
        Electrodomestico e2 = new Lavarropa();
        Electrodomestico e3 = new Lavarropa();
        Electrodomestico e4 = new TV();
        Electrodomestico e5 = new TV(9000, 60, ConsumoElectrico.C, Color.NEGRO, 66, true);
        Electrodomestico e6 = new AireAcondicionado();
        Electrodomestico e7 = new AireAcondicionado();
        electrodomesticos.add(e1);
        electrodomesticos.add(e2);
        electrodomesticos.add(e3);
        electrodomesticos.add(e4);
        electrodomesticos.add(e5);
        electrodomesticos.add(e6);
        electrodomesticos.add(e7);

        for (Electrodomestico e : electrodomesticos) {
            System.out.println(e.precioFinal());
        }

        System.out.println( Utils.get_precios_por_categoria( electrodomesticos ) );
        System.out.println( Utils.colores_mas_utilizados( electrodomesticos ));
    }
}
