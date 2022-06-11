import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        Menu menu = new Menu();
        Scanner choice = new Scanner(System.in);
        String eleccion;

        menu.registro(p1);
        System.out.println("El precio a pagar acutalmente es de " + menu.total() + " pesos");
        System.out.println("Quiere seguir registrando productos? y/n");
        eleccion = choice.nextLine();
        while(Objects.equals(eleccion, "y") || Objects.equals(eleccion, "Y")){
            menu.registro(p1);
            System.out.println("El precio a pagar acutalmente es de " + menu.total() + " pesos");
            System.out.println("Quiere seguir registrando productos? y/n");
            eleccion = choice.nextLine();
        }
        if(Objects.equals(eleccion, "n")||Objects.equals(eleccion, "N")) {
            System.out.println("El precio a pagar acutalmente es de " + menu.total() + " pesos");
        }
        else while(!Objects.equals(eleccion, "y") && !Objects.equals(eleccion, "Y") && !Objects.equals(eleccion, "n") && !Objects.equals(eleccion, "N")) {
            System.out.println("Caracter no valido, elija entre Y (yes) o N (no)");
            eleccion = choice.nextLine();
        }
    }
}

