import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class SistemaECommerce {
    private HashSet<Cliente> clientes;
    private HashSet<Componente> componentes;
    private HashSet<Compra> ventas;
    private int id;

    public SistemaECommerce() {
        this.clientes = new HashSet<>();
        this.componentes = new HashSet<>();
        this.ventas = new HashSet<>();
        this.id = 0;
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void agregarComponente(Componente componente) {
        componentes.add(componente);
        componente.setId(id);
        id++;
    }

    private Object obtenerProducto(int idProducto) {
        for (Componente componente: componentes) {
            if (componente.getId() == idProducto) return componente;
        }
        return null;
    }

    private boolean compraPosible(ArrayList<Integer> carrito) {
        boolean tieneCPU = false;
        boolean tieneOutput = false;
        boolean tieneInput = false;

        for (int idProducto: carrito) {
            Componente componente = (Componente) obtenerProducto(idProducto);
            if (componente == null) return false;
            if (componente.getStock() == 0) return false;

            if (componente instanceof DispositivoEntrada) tieneInput = true;
            else if (componente instanceof DispositivoSalida) tieneOutput = true;
            else if (componente instanceof CPU) tieneCPU = true;
        }

        return tieneInput && tieneOutput && tieneCPU;
    }

    private float calcularPrecioFinalCarrito(ArrayList<Integer> carrito) {
        float precioFinal = 0;

        for (int idProducto: carrito) {
            Componente producto = (Componente) obtenerProducto(idProducto);
            precioFinal += producto.getPrecio();
        }

        return precioFinal;
    }

    private void reducirStockProductos(ArrayList<Integer> carrito) {
        for (int idProducto: carrito) {
            Componente producto = (Componente) obtenerProducto(idProducto);
            producto.onCompra();
        }
    }



    public void comprar(Cliente cliente, char metodoPago) {
        if (!compraPosible(cliente.getCarrito())) {
            System.out.println("La compra ha fallado :(");
        }

        Compra compra = new Compra(cliente.getCarrito(), metodoPago);
        float precioFinal = calcularPrecioFinalCarrito(cliente.getCarrito());

        if (metodoPago == 'd' || metodoPago == 'c') {
            precioFinal += precioFinal * 5/100;
            compra.setTarjeta(cliente.getTarjeta());
        }

        reducirStockProductos(cliente.getCarrito());
        ventas.add(compra);

        System.out.println("La compra se ha realizado con éxito " + precioFinal);
    }

    public HashMap<String, Integer> calcularCantidadDispositivosPorTipo(ArrayList<Componente> carrito) {
        HashMap<String, Integer> cantidadDispositivosPorTipo = new HashMap<>();
        cantidadDispositivosPorTipo.put("DispositivosEntrada", 0);
        cantidadDispositivosPorTipo.put("DispositivosSalida", 0);

        for (Componente componente: componentes) {
            if (componente instanceof DispositivoSalida) cantidadDispositivosPorTipo.put("DispositivosSalida", cantidadDispositivosPorTipo.get("DispositivosSalida") + 1);
            if (componente instanceof DispositivoEntrada) cantidadDispositivosPorTipo.put("DispositivoEntrada", cantidadDispositivosPorTipo.get("DispositivoEntrada") + 1);
        }

        return cantidadDispositivosPorTipo;
    }

    public static void main(String[] args) {
        Cliente cli = new Cliente("a", "b", "c", "d", 1, 2, 3, 4);
        SistemaECommerce SEC = new SistemaECommerce();
        ArrayList<PUERTO> ports = new ArrayList<>();
        ports.add(PUERTO.VGA);
        CPU cpu = new CPU("a", "b", "c", 100, 25, 2);
        DispositivoEntrada dE = new DispositivoEntrada("e", "f", "g", 150, 12, PUERTO.HDMI);
        DispositivoSalida dS = new DispositivoSalida("n", "p", "abc", 543, 21, ports);

        SEC.agregarComponente(cpu);
        SEC.agregarComponente(dE);
        SEC.agregarComponente(dS);

        cli.agregarAlCarrito(cpu.getId());
        cli.agregarAlCarrito(dE.getId());
        cli.agregarAlCarrito(dS.getId());

        SEC.comprar(cli, 'd');

    }
}
