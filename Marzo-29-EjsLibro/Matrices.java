import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> A2 = new ArrayList<>();
        ArrayList<Integer> A3 = new ArrayList<>();
        ArrayList<Integer> A4 = new ArrayList<>();
        int sumaSinDiagonal = 0;

        A1.add(4);
        A1.add(7);
        A1.add(-5);
        A1.add(4);
        A1.add(9);

        A2.add(0);
        A2.add(3);
        A2.add(-2);
        A2.add(6);
        A2.add(-2);

        A3.add(1);
        A3.add(2);
        A3.add(4);
        A3.add(1);
        A3.add(1);

        A4.add(6);
        A4.add(1);
        A4.add(0);
        A4.add(3);
        A4.add(-4);

        matriz.add(A1);
        matriz.add(A2);
        matriz.add(A3);
        matriz.add(A4);

        for(int i = 0; i < matriz.size(); i++){
            for (int j = 0; j < 5; j++){
                if(i!=j){
                    sumaSinDiagonal += matriz.get(i).get(j);

                }
            }
        }
        System.out.print(sumaSinDiagonal);
    }
}
