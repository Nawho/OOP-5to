public class Excepciones {
    public static void tryCatch() {
        try {
            String nombre = null;
            System.out.println("El nombre es: " + nombre.length());
        } catch(NullPointerException err) {
            System.out.println(err.getMessage());
        }
    }

    public static void throweador() {
        try {
            String nombre = null;
            if (nombre == null) throw new NullPointerException();
            System.out.println("El nombre es: " + nombre.length());
        } catch(Exception err) {
            System.out.println(err);
        }
    }

    public static void throwseador() throws NullPointerException {
        try {
            String nombre = null;
            if (nombre == null)
                System.out.println("El nombre es: " + nombre.length());
        } catch(Exception err) {
        System.out.println(err);
    }
    }

    public static void claseCustom() {
        try {
        String nombre = null;
        if (nombre == null) throw new MyNullPointerException();
        System.out.println("El nombre es: " + nombre.length());
        } catch(Exception err) {
            System.out.println(err);
        }
    }
}
