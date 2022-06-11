public class Main {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(23, 11, 2004);
//        System.out.println("days in january: " + fecha.daysInMonth(11));
        fecha.advance(20,1,0);
        fecha.mostrar();
    }
}
