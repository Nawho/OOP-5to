import java.util.ArrayList;

public class RevArray{
    public static void revArray(String[] args){
        ArrayList<Integer> reverseArray = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            reverseArray(i+1);
        }

        for(int i = reverseArray()-1; i >= 0; i--) {
            System.out.println(reverseArray.get(i));
        }
    }
}
