import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Banco {
    private String nombre;
    private ArrayList<Cliente> clientesQueVisitaronElBanco;

    public Banco() {
        this.nombre = "LetoBank";
        this.clientesQueVisitaronElBanco = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cliente> getClientesQueVisitaronElBanco() {
        return clientesQueVisitaronElBanco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClientesQueVisitaronElBanco(ArrayList<Cliente> clientesQueVisitaronElBanco) {
        this.clientesQueVisitaronElBanco = clientesQueVisitaronElBanco;
    }

    public HashSet<Integer> cbusDeClientesVisitantes() {
        HashSet<Integer> cbus = new HashSet<>();
        for(Cliente c : clientesQueVisitaronElBanco) {
            cbus.add(c.getCBU());
        }
        return cbus;
    }

    public void mostrarCBUsClientes(HashSet<Integer> cbus) {
        for(Integer cbu : cbus) {
            System.out.println(cbu);
        }
    }

    public HashMap<Integer, Integer> cantidadDeVisitasPorCliente() {
        HashMap<Integer, Integer> visitasPorCliente = new HashMap<>();
        for(Cliente c : clientesQueVisitaronElBanco) {
            visitasPorCliente.put(c.getCBU(), visitasPorCliente.get(c.getCBU())+1);
        }
        return visitasPorCliente;
    }

}
