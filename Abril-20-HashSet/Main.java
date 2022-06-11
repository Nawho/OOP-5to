import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main (String[] args) {
        HashSetPractice practice = new HashSetPractice();
        HashSetPractice practice2 = new HashSetPractice();

        ArrayList<Integer> lista = practice.ingresoDeNumeros();
        practice.filtrarRepetidos(lista);

        ArrayList<Integer> lista2 = practice2.ingresoDeNumeros();
        practice2.filtrarRepetidos(lista2);


        if(lista.containsAll(lista2)) {
            System.out.println("sonIguales");
        } else System.out.println("No son iguales");
    }
}
