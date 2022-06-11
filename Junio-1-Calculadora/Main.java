public class Main {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        Programa p = new Programa();
        p.agregarInstruccion("sumar", new Instruccion(Operacion.PUSH, 5));
        p.agregarInstruccion("sumar", new Instruccion(Operacion.PUSH, 15));
        p.agregarInstruccion("sumar", new Instruccion(Operacion.ADD));

        p.agregarInstruccion("restar", new Instruccion(Operacion.PUSH, 5));
        p.agregarInstruccion("restar", new Instruccion(Operacion.PUSH, 15));
        p.agregarInstruccion("restar", new Instruccion(Operacion.SUB));

        p.agregarInstruccion("mult", new Instruccion(Operacion.PUSH, 3));
        p.agregarInstruccion("mult", new Instruccion(Operacion.PUSH, 20));
        p.agregarInstruccion("mult", new Instruccion(Operacion.MUL));

        p.agregarInstruccion("pushear", new Instruccion(Operacion.PUSH, 3));
        p.agregarInstruccion("pushear", new Instruccion(Operacion.PUSH, 5));
        p.agregarInstruccion("pushear", new Instruccion(Operacion.PUSH, 13));
        p.agregarInstruccion("pushear", new Instruccion(Operacion.PUSH, 20));

        p.agregarInstruccion("readwritear", new Instruccion(Operacion.PUSH, 5));
        p.agregarInstruccion("readwritear", new Instruccion(Operacion.WRITE, "x"));
        p.agregarInstruccion("readwritear", new Instruccion(Operacion.PUSH, 15));
        p.agregarInstruccion("readwritear", new Instruccion(Operacion.READ, "x"));
        p.agregarInstruccion("readwritear", new Instruccion(Operacion.SUB));


        calc.cargarPrograma(p);
        calc.ejecutar("readwritear");

    }
}
