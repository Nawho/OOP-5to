public class Main {
    public static void main(String[] args) {
        Alumno jorge = new Alumno();
        jorge.agregarNota("Matematica", 7);
        jorge.agregarNota("Matematica", 8);
        jorge.agregarNota("Matematica", 5);
        jorge.agregarNota("Matematica", 9);
        jorge.agregarNota("Lengua", 9);
        jorge.agregarNota("Ingles", 2.5f);

        jorge.agregarMateria("Plastica");
        jorge.agregarNota("Plastica", 2);

        System.out.println(jorge.mayorNota() + " " + jorge.menorNota() + " " + jorge.promedioNotas());

    }
}
