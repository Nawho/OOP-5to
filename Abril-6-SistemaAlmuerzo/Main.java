import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaAlmuerzo buffet = new SistemaAlmuerzo();
        Scanner myObj = new Scanner(System.in);
        Scanner myOtherObj = new Scanner(System.in);

        System.out.println("Bienvenido!");
        System.out.println("1. Agregar pedido.");
        System.out.println("2. Modificar un pedido existente.");
        System.out.println("3. Eliminar un pedido existente.");
        System.out.println("4. Salir");

        int respuesta = myObj.nextInt();
        String nombre;

        while(respuesta != 4) {
            switch (respuesta) {
                case 1 -> buffet.agregarPedidos();
                case 2 -> {
                    System.out.println("Ingrese el nombre del alumno al que modificar el pedido");
                    nombre = myOtherObj.nextLine();
                    buffet.modificarPedido(nombre);
                }
                case 3 -> {
                    System.out.println("Ingrese el nombre del alumno al que eliminar el pedido");
                    String nombreEliminar = myOtherObj.nextLine();
                    buffet.borrarPedido(nombreEliminar);
                }
            }
            respuesta = myObj.nextInt();
        }

        buffet.imprimirInforme();
    }
}
