import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SistemaLibreria {
    private HashSet<Cliente> clientes;
    private ArrayList<Libro> librosEnVenta;
    private ArrayList<Integer> librosEnOferta;
    private ArrayList<Libro> librosVendidos;
    private String nombre;
    private HashSet<String> editorialesConDescuento;
    private HashMap<Integer, Float> importePorCliente;

    public SistemaLibreria() {
        this.clientes = new HashSet<>();
        this.librosEnVenta = new ArrayList<>();
        this.librosEnOferta = new ArrayList<>();
        this.nombre = "";
        this.editorialesConDescuento = new HashSet<>();
        this.importePorCliente = new HashMap<>();
        this.librosVendidos = new ArrayList<>();
    }

    public void agregarEditorialesConDescuento(String editorial) {
        editorialesConDescuento.add(editorial);
    }

    public void informacionDeVenta(int id, Libro l) {
        float precio;

        if (editorialesConDescuento.contains(l.getEditorial())) precio = l.getPrecio()/2;
        else precio = l.getPrecio();
        if (importePorCliente.containsKey(id)) precio += importePorCliente.get(id);

        importePorCliente.put(id, precio);
    }

    public HashSet<Cliente> getClientes() { return clientes; }
    public ArrayList<Libro> getLibrosEnVenta() { return librosEnVenta; }

    public void setClientes(HashSet<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cliente> listaDeClientesMasFrecuentes() {
        ArrayList<Cliente> clientesFrecuentes = new ArrayList<>();

        for (Cliente cliente : clientes) {
            if (cliente.getLibroscompradosSize() >= 10) {
                clientesFrecuentes.add(cliente);
            }
        }

        return clientesFrecuentes;
    }

    public ArrayList<Integer> mostrarEdadesDeClientesFrecuentes(){
        ArrayList<Integer> edadesDeClientesFrecuentes = new ArrayList<>();

        for (Cliente c : this.listaDeClientesMasFrecuentes()) {
            edadesDeClientesFrecuentes.add(c.getEdad());
        }

        return edadesDeClientesFrecuentes;
    }

    public ArrayList<Libro> librosMasCaros(){
        ArrayList<Libro> librosCaros = new ArrayList<>();
        for (Libro l : this.getLibrosEnVenta()) {
            if(l.getPrecio() > 5500.50){
                librosCaros.add(l);
            }
        }
        return librosCaros;
    }

    public HashMap<Integer, Integer> librosMasVendidos() {
        HashMap<Integer, Integer> librosConContador = new HashMap<>();

        for (Libro l : this.librosVendidos) {
            if (librosConContador.containsKey(l.getId())) {
                librosConContador.put(l.getId(), librosConContador.get(l.getId()) + 1);
            }
            else librosConContador.put(l.getId(), 1);
        }


        return librosConContador;
    }

    public void venderLibro(Libro l, Cliente c){
        librosVendidos.add(l);
        c.agregarLibroComprado(l);
        c.comprarLibro(l.getId());
        informacionDeVenta(c.getId(), l);
    }

    public ArrayList<Libro> mostrarLibrosPorLetra(String c){
        ArrayList<Libro> librosConLetra = new ArrayList<>();

        for (Libro l : librosEnVenta){
            if (l.getNombre().startsWith(c)){
                librosConLetra.add(l);
            }
        }
        return librosConLetra;
    }

    public void cambiarPrecioLibroPorId(int id, float descuento){
        for(Libro l : this.getLibrosEnVenta()){
            if (l.getId() == id){
                l.cambiarPrecio(descuento);
            }
        }
    }

    public void descuentosNavidenos(){
        for(Libro l : this.getLibrosEnVenta()){
            if(l.getId() % 2 == 0){
                l.cambiarPrecio(25);
            }
            else {
                l.cambiarPrecio(35);
            }
        }
    }

    public void compraFinalDelCliente() {
        for (Cliente c : clientes){
            System.out.println("Cliente " + c.getId() + ": ");
            for (Integer idLibro : c.getCantDeLibrosDeUnTipo().keySet()){
                Libro libroActual = null;
                for (Libro l : librosVendidos){
                    if (l.getId() == idLibro) libroActual = l;
                }

                assert libroActual != null;
                System.out.println("Libro: " + libroActual.getNombre() + ", unidades: " + c.getCantDeLibrosDeUnTipo().get(idLibro));
            }
            System.out.print("Importe final: " + importePorCliente.get(c.getId()));
        }
    }
}

