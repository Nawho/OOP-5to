/*1. Crear la clase Persona con los siguientes atributos:
nombre
edad
dni
telefono
dirección

Declarar e implementar 3 tipos de constructores:
Uno por defecto.
Uno con parámetro string.
Otro con los 5 parámetros correspondientes a todos los atributos.
Declarar e implementar los getters y setters.

Agregar métodos con los siguientes nombres:
esMayorDeEdad
sonLaMismaPersona
tienenLaMismaEdad

Dentro de la función main, crear 3 instancias distintasde la clase Persona.
A la primer instancia, cambiarle el valor de la edad por el doble de la misma.
A la segunda instancia, cambiarle el valor del teléfono.
Con respecto a la terce instancia, imprimir por consola todos sus datos.

*/


import java.io.IOException;
import java.util.Scanner;


class CLS {
    public static void main(String... arg) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}


class Persona {

    String nombre;
    int edad;
    int dni;
    int telefono;
    String direccion;

    Persona(String nombre){
        this.nombre = nombre;
    }

    Persona(){
        this.nombre = "Fulano";
        this.edad = 42;
        this.direccion = "La Pampa";
        this.dni = 7;
        this.telefono = 123;
    }

    Persona(String nombre, String direccion, int edad, int dni, int telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
    }

    void setEdad(int edad){
        this.edad = edad;
    }

    void setDni(int dni){
        this.dni = dni;
    }

    void setTelefono(int telefono){
        this.telefono = telefono;
    }

    void setNombre(String nombre){
        this.nombre = nombre;
    }

    void setDireccion(String direccion){
        this.direccion = direccion;
    }

    int getEdad(){
        return this.edad;
    }

    int getDni(){
        return this.dni;
    }

    int getTelefono(){
        return this.telefono;
    }

    String getNombre(){
        return this.nombre;
    }

    String getDireccion(){
        return this.direccion;
    }

    boolean esMayorDeEdad(){
        return this.getEdad() > 18;
    }

    boolean esLaMismaPersona(Persona P1){
        return this.dni == P1.getDni();
    }

    boolean tienenLaMismaEdad(Persona P1){
        return this.edad == P1.getEdad();
    }

    void mostrarDatos(){
        System.out.println(
                "Nombre: " + this.getNombre() + "\n" +
                "Edad: " + this.getEdad() + "\n" +
                "Direccion: " + this.getDireccion() + "\n" +
                "DNI: " + this.getDni() + "\n" +
                "Telefono: " + this.getTelefono()
        );
    }
}


class Menu{
    void inicio(Persona P){
        System.out.println("Ingrese nombre, direccion, edad,  dni y telefono");
        Scanner OBJ = new Scanner(System.in);
        P.setNombre(OBJ.nextLine());
        P.setDireccion(OBJ.nextLine());
        P.setEdad(OBJ.nextInt());
        P.setDni(OBJ.nextInt());
        P.setTelefono(OBJ.nextInt());

        System.out.println("\nLos datos ingresados fueron: ");
        P.mostrarDatos();
    }

    void cambiarDatos(Persona P) throws IOException, InterruptedException {
        CLS.main();
        System.out.println("1. Cambiar nombre" + "\n" + "2. Cambiar direccion" + "\n" + "3. Cambiar edad" + "\n" + "4. Cambiar DNI" + "\n" + "5. Cambiar telefono" + "\n");

        Scanner OBJ = new Scanner(System.in);

        int eleccion = OBJ.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Nuevo nombre:");
                P.setNombre(OBJ.next());
                break;

            case 2:
                System.out.println("Nueva direccion:");
                P.setDireccion(OBJ.next());
                break;

            case 3:
                System.out.println("Nueva edad:");
                P.setEdad(OBJ.nextInt());
                break;

            case 4:
                System.out.println("Nuevo DNI (illegal):");
                P.setDni(OBJ.nextInt());
                break;

            case 5:
                System.out.println("Nuevo telefono:");
                P.setTelefono(OBJ.nextInt());
                break;
        }

        System.out.println("Sus nuevos datos son: ");
        P.mostrarDatos();
    }

    void mainLoop(Persona P) throws IOException, InterruptedException {
        Scanner OBJ = new Scanner(System.in);
        ;
        System.out.println("\nMenu: \n1. Mostrar datos \n2. Cambiar datos \n3. Salir");
        int choice = OBJ.nextInt();

        switch (choice){
            case 1:
                P.mostrarDatos();
                break;
            case 2:
                this.cambiarDatos(P);
                break;

            case 3:
                return;
        }
        mainLoop(P);
    }
}

public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();

        //E1P1
        p1.setEdad(p1.getEdad()*2);
        //System.out.println(p1.getEdad());

        //E1P2
        p2.setTelefono(900);
        //System.out.println(p2.getTelefono());

        //E1P3
        //System.out.println(p3.getNombre() + ", " + p3.getEdad() + ", " + p3.getDireccion() + ", " + p3.getDni() + ", " + p3.getTelefono());

        Menu menu = new Menu();
        menu.inicio(p2);
        menu.mainLoop(p2);
    }
}

/*
1) Crear una aplicación que pida al usuario ingresar los datos necesarios para crear un objeto de la clase Persona.
2) Crear la instancia de la clase Persona e imprimir cuáles fueron los datos ingresados utilizando "getters".
3) Ofrecerle al usuario la opción de cambiar uno de sus datos (el usuario deberá elegir), realizar el cambio utilizando
"setters" e imprimir nuevamente los datos del objeto creado.
 */



