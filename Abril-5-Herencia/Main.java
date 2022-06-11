import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hijo Carlitos = new Hijo("Carlitos");
        Carlitos.setEdad(10);
        Hijo Juancito = new Hijo("Juancito", "ABC10", 7, 10, 11, "Just shapes & beats", "IPM");
        Hijo Mariano = new Hijo("Mariano", "ABC10", 19, 20, 12, "DOOM", "IPM");
        Madre Florencia = new Madre("Florencia");

        ArrayList<Hijo> hijosDeFlor = new ArrayList<>();
        hijosDeFlor.add(Carlitos);
        hijosDeFlor.add(Juancito);
        hijosDeFlor.add(Mariano);

        Florencia.setListaDeHijos(hijosDeFlor);

        ArrayList<Hijo> hijosMenoresDeFlor = Florencia.hijosMenores();
        Juancito.mostrarDatos();
        Mariano.mostrarDatos();
        Florencia.mostrarDatos();

        for (Hijo hijoMenor : hijosMenoresDeFlor){
            System.out.println(hijoMenor.getNombre());
        }
    }
}
