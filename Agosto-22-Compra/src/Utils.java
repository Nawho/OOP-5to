public class Utils {
	public static String numbers_to_string(int n1, int n2, int n3, int n4) {
		String final_string = new String();

		final_string += String.valueOf(n1);
		final_string += String.valueOf(n2);
		final_string += String.valueOf(n3);
		final_string += String.valueOf(n4);

		return final_string;
	}

	public static int string_to_integer(String n) {
        char[] c_string = n.toCharArray();
        int final_number = 0;
        int j = 0;

        for (int i = c_string.length - 1; i >= 0; i--) {
            final_number += ((int) c_string[i] - 48) * Math.pow(10, j);
            j++;
        }

        return final_number;
    }
}
