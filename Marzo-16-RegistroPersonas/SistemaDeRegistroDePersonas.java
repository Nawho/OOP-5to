import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeRegistroDePersonas {
    ArrayList<Persona> personas;
    Menu menu;

    public SistemaDeRegistroDePersonas(){
        this.personas = new ArrayList<>();
        this.menu = new Menu();
    }
    
    public void registrar(){
        personas.add(menu.IngresarPersona()); //registra persona :D
    }

    public void eliminar(){
        System.out.println("Inserte el DNI de la persona a eliminar del registro: ");
        Scanner myObj = new Scanner(System.in);
        int Dni = myObj.nextInt();

        this.personas.removeIf(p -> {p.getDni() == Dni)})

        /* for(int i = 0; i < personas.size(); i++) {
            if(personas.get(i).dni == Dni) {
                personas.remove(i);
                break;
            }
        } */
    }

    public void modificar(){
        System.out.println("Inserte el DNI de la persona a modificar en el registro: ");
        Scanner myObj = new Scanner(System.in);
        int Dni = myObj.nextInt();
        for (Persona persona : personas) {
            if (persona.dni == Dni) {
                menu.cambiarDatos(persona);
                break;
            }
        }
    }

    public void MostrarUnaListaDeMayoresDe18(){
        for (Persona persona : personas) {
            if (persona.edad >= 18) System.out.println(persona.nombre);
        }
    }

    public void MostrarUnaListaConTodasLasPersonasRegistradas(){
        for (Persona persona : personas) {
            persona.mostrarDatos();
        }
    }
}


