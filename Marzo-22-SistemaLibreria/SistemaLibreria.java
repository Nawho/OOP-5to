import java.util.ArrayList;
import java.util.HashMap;

public class SistemaLibreria {
    private ArrayList<Cliente> clientes;
    private ArrayList<Libro> librosEnVenta;
    private ArrayList<Integer> librosEnOferta;
    private ArrayList<Libro> librosVendidos;
    private String nombre;


    public SistemaLibreria() {
        this.clientes = new ArrayList<>();
        this.librosEnVenta = new ArrayList<>();
        this.librosEnOferta = new ArrayList<>();
        this.nombre = "";
    }

    public ArrayList<Cliente> getClientes() { return clientes; }
    public ArrayList<Libro> getLibrosEnVenta() { return librosEnVenta; }

    public void setClientes(ArrayList<Cliente> clientes) {
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

        for (Libro l : librosVendidos) {

            librosConContador.put(l.getId(), 1);
        }


        return librosConContador;
    }

    public void venderLibro(Libro l, Cliente c){
        librosVendidos.add(l);
        c.agregarLibroComprado(l);
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
}

