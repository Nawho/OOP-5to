public class IngresosConDNI {
    private int DNI;
    private int ingresos;

    public IngresosConDNI(int DNI) {
        this.DNI = DNI;
        this.ingresos = 1;
    }

    public int getDNI() {return this.DNI;}
    public int getIngresos() {return this.ingresos;}

    public void aumentarIngresos(){
        this.ingresos++;
    }
}
