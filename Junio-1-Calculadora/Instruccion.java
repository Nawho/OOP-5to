public class Instruccion {
    Operacion operacion;
    String var;
    double num;


    public Instruccion(Operacion operacion) {
        this.operacion = operacion;
    }

    public Instruccion(Operacion operacion, String var) {
        this.operacion = operacion;
        this.var = var;
    }

    public Instruccion(Operacion operacion, double num) {
        this.operacion = operacion;
        this.num = num;
    }
}
