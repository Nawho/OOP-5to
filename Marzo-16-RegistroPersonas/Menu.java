
import java.io.IOException;
import java.util.Scanner;

public class Menu{
    Persona IngresarPersona(){
        System.out.println("Ingrese nombre, direccion, edad, DNI y telefono");
        Scanner OBJ = new Scanner(System.in);

        return new Persona(OBJ.nextLine(), OBJ.nextLine(), OBJ.nextInt(), OBJ.nextInt(), OBJ.nextInt());
    }

    public void cambiarDatos(Persona P){
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
                System.out.println("Nuevo DNI:");
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

    public void mainLoop(SistemaDeRegistroDePersonas registro) throws IOException {
        Scanner OBJ = new Scanner(System.in);
        System.out.println("\nMenu: \n1. Ingresar persona \n2. O B L I T E R A R Persona \n3. Modificar persona \n4. Ver mayores de 18 \n5. Ver personas registradas \n6. Salir");
        int choice = OBJ.nextInt();

        Runtime.getRuntime().exec("clear");

        switch (choice){
            case 1:
                registro.registrar();
                break;

            case 2:
                registro.eliminar();
                break;

            case 3:
                registro.modificar();
                break;

            case 4:
                registro.MostrarUnaListaDeMayoresDe18();
                break;

            case 5:
                registro.MostrarUnaListaConTodasLasPersonasRegistradas();
                break;

            case 6:
                System.out.println("Bye :D");
                return;
        }
        mainLoop(registro);
    }
}