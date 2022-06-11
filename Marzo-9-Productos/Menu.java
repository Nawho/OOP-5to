import java.util.Scanner;

public class Menu {
    float precio_total;

    public void registro(Producto p1){
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto:");
        p1.nombre= obj.nextLine();
        System.out.println("Ingrese el precio del producto:");
        p1.precio = obj.nextInt();
        precio_total += p1.precio;
    }

    public float total(){
        return precio_total;
    }
}
