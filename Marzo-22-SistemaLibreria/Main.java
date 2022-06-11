import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        SistemaLibreria sistema = new SistemaLibreria();

     /*   Libro libro = new Libro(4, 5000, "Las crónicas de Hernández", "Kapeluz");
        ArrayList<Libro> librosComprados = new ArrayList<>(
        );

        for (int i = 0; i < 150; i++) {
            librosComprados.add(libro);
        }

        Cliente cli = new Cliente();

        for (Libro l: cli.getLibroscomprados()) {
            System.out.println(l.getId());
        }

        ArrayList<Cliente> losClientes = new ArrayList<>();
        losClientes.add(cli);

        sistema.setClientes(losClientes);

        for(Cliente c: sistema.getClientes()) {
            System.out.println(c.getId());
        }

        HashMap<Integer, Integer> librosVendidos = sistema.librosMasVendidos();

        for(Integer i : librosVendidos.keySet()){
            if (librosVendidos.get(i) > 100){
                System.out.println("Libro " + i + ", Ventas " + librosVendidos.get(i));
            }
        }

        String a = "abc";
        String b = "a";

        System.out.println(a.startsWith(b));*/

        Libro l = new Libro(5, 1000, "a", "b");
        System.out.println(l.getPrecio());
        l.cambiarPrecio(30, 10000);
        System.out.println(l.getPrecio());
    }
}
