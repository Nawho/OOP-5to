import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        SistemaLibreria sistema = new SistemaLibreria();

        Libro libro = new Libro(4, 5000, "Las crónicas de Hernández", "Kapeluz");
        Cliente cli = new Cliente();

        for (int i = 0; i < 150; i++) {
            sistema.venderLibro(libro, cli);
        }

        HashSet<Cliente> losClientes = new HashSet<>();
        losClientes.add(cli);

        sistema.setClientes(losClientes);

        for(Cliente c: sistema.getClientes()) {
            System.out.println(c.getId());
        }

        HashMap<Integer, Integer> librosVendidos = sistema.librosMasVendidos();

        for(Integer i : librosVendidos.keySet()){
            System.out.println(librosVendidos.get(i));
            if (librosVendidos.get(i) > 100){
                System.out.println("Libro " + i + ", Ventas " + librosVendidos.get(i));
            }
        }

        sistema.compraFinalDelCliente();

        //System.out.println(a.startsWith(b));

       /* Libro l = new Libro(5, 1000, "a", "b");
        System.out.println(l.getPrecio());
        l.cambiarPrecio(30, 10000);
        System.out.println(l.getPrecio());*/
    }
}
