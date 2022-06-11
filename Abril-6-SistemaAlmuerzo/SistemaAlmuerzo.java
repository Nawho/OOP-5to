import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAlmuerzo {
    private ArrayList<Pedido> listaDePedidos;

    public SistemaAlmuerzo() {
        this.listaDePedidos = new ArrayList<>();
    }

    public void agregarPedidos() {
        Scanner myObj = new Scanner(System.in);
        Pedido pedido = new Pedido();
        cambiarFecha(pedido);
        System.out.println("Ingrese el nombre del plato: ");
        pedido.setNombre(myObj.nextLine());
        System.out.println("Ingrese el nombre del alumno: ");
        pedido.setNombreAlumno(myObj.nextLine());
        pedido.setPrecio();
        this.listaDePedidos.add(pedido);
    }

    public void modificarPedido(String nombreAlumno) {
        Scanner myObj = new Scanner(System.in);
        for(Pedido pedido : listaDePedidos) {
            if(pedido.getNombreAlumno().equals(nombreAlumno)){
                System.out.println("Presione 1 para modificar la fecha y 2 para modificar el pedido");
                int respuesta = myObj.nextInt();
                while(respuesta < 1 || respuesta > 2) {
                    System.out.println("Elija una opcion valida");
                    respuesta = myObj.nextInt();
                }
                if(respuesta == 1){
                    cambiarFecha(pedido);
                };

                if(respuesta == 2){
                    cambiarPedido(pedido);
                }
            }
        }
    }

    public void cambiarFecha(Pedido pedido){
        Scanner myObj = new Scanner(System.in);
        int hora, minuto;
        System.out.print("hora: ");
        hora = myObj.nextInt();
        if(hora < 0 || hora > 23) hora = pedido.getHoraDeEntrega().getHour();
        System.out.print("minuto: ");
        minuto = myObj.nextInt();
        if(minuto < 0 || minuto > 59) minuto = pedido.getHoraDeEntrega().getMinute();
        pedido.setHoraDeEntrega(LocalTime.of(hora, minuto));
    }

    public void cambiarPedido(Pedido pedido){
        Scanner myObj = new Scanner(System.in);
        pedido.setNombre(myObj.nextLine());
    }

    public void borrarPedido(String nombreAlumno) {
        listaDePedidos.removeIf(pedido -> pedido.getNombreAlumno().equals(nombreAlumno));
    };

    public void mostrarPedidos(){
        for(Pedido pedido : listaDePedidos) {
            System.out.println(pedido.getFechaPedido());
            System.out.println(pedido.getHoraDeEntrega());
            System.out.println(pedido.getNombreAlumno());
            System.out.println(pedido.getNombre());
            System.out.println(pedido.getPrecio());
            System.out.println();
        }
    }

    public void imprimirInforme(){
        int suma = 0;
        for(Pedido pedido : listaDePedidos){
            System.out.println(pedido.getNombre());
            suma += pedido.getPrecio();
        }
        System.out.println(suma);
    }
}
