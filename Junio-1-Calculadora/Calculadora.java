import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

public class Calculadora {
    Stack<Double> pila;
    HashMap<String, Double> memoria;

    Programa programa;


    public Calculadora() {
        this.pila = new Stack<>();
        this.memoria = new HashMap<>();
    }


    public void push(double n){
        pila.push(n);
    }


    public void add(){
        int stackSize = pila.size();

        if (stackSize == 0){
            pila.push(0d);
        } else if (stackSize > 1) {
            double n1 = pila.pop();
            double n2 = pila.pop();

            pila.push(n1 + n2);
        }
    }


    public void sub(){
        int stackSize = pila.size();

        if (stackSize == 0){
            pila.push(0d);
        } else if (stackSize == 1) {
            double n = pila.pop();
            pila.push(-n);
        } else {
            double sustraendo = pila.pop();
            double minuendo = pila.pop();

            pila.push(minuendo - sustraendo);
        }
    }


    public void mul(){
        int stackSize = pila.size();

        if (stackSize == 0){
            pila.push(0d);
        } else if (stackSize == 1) {
            pila.pop();
            pila.push(0d);
        } else {
            double n1 = pila.pop();
            double n2 = pila.pop();

            pila.push(n1 * n2);
        }
    }


    public void write(String var){
        memoria.put(var, pila.pop());
    }


    public void read(String var){
        pila.push(memoria.getOrDefault(var, 0d));
    }


    public void cargarPrograma(Programa p) {
        programa = p;
    }


    public void ejecutar(String nombreRutina){
        ArrayList<Instruccion> instrucciones = programa.getRutinas().get(nombreRutina);

        for (Instruccion instruccion: instrucciones) {
            switch (instruccion.operacion) {
                case ADD:
                    this.add();
                    break;

                case SUB:
                    this.sub();
                    break;

                case MUL:
                    this.mul();
                    break;

                case READ:
                    this.read(instruccion.var);
                    break;

                case WRITE:
                    this.write(instruccion.var);
                    break;

                case PUSH:
                    this.push(instruccion.num);
                    break;
            }
        }

    }
}
