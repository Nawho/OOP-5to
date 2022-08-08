public class RaicesDeCuadratica {
    private double a, b, c;

    public RaicesDeCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int cantidadDeRaices() {
        if((Math.pow(b, 2) - 4*a*c) < 0) return 0;
        else if((Math.pow(b, 2) - 4*a*c) == 0) return 1;
        else return 2;
    }

    public void calcularRaices() {
        double r0, r1;
        r0 = ((-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / 2*a);
        r1 = ((-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / 2*a);
        switch (cantidadDeRaices()) {
            case 0:
                System.out.println("No hay raices reales");
                break;
            case 1:
                System.out.println(r0);
                break;
            case 2:
                System.out.println(r0 + ", " + r1);
                break;
        }
    }

    public static void main(String[] args) {
        RaicesDeCuadratica formula1 = new RaicesDeCuadratica(1, 2, -3);
        formula1.calcularRaices();
    }
}
