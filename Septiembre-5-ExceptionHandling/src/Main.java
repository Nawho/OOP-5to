public class Main {
    public static void main(String[] args) {
        try {
            Excepciones.tryCatch();
            Excepciones.throweador();
            Excepciones.throwseador();
            Excepciones.claseCustom();
        } catch (Exception err) {
            System.out.println(err);
        } finally {
            System.out.println("<3 - Mr Maier & Serra");
        }
    }
}