import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetPractice {
    private ArrayList<Integer> list;
    private HashSet<Integer> set;
    private final Scanner scanner = new Scanner(System.in);

    public HashSetPractice() {
        this.list = new ArrayList<>();
        this.set = new HashSet<>();
    }

    public ArrayList<Integer> ingresoDeNumeros(){
        System.out.println("Ingrese la cantidad de caracteres a ingresar: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un caracter a ingresar: ");
            this.list.add(scanner.nextInt());
        }
        return list;
    }

    public void filtrarRepetidos(ArrayList<Integer> list) {
        this.set.addAll(list);
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
