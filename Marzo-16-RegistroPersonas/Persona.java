public class Persona {
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

    void setEdad(int edad){ this.edad = edad; }

    void setDni(int dni){ this.dni = dni; }

    void setTelefono(int telefono){ this.telefono = telefono; }

    void setNombre(String nombre){ this.nombre = nombre; }

    void setDireccion(String direccion){ this.direccion = direccion; }


    int getEdad(){ return this.edad; }

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
        "Telefono: " + this.getTelefono() +
        "\n");
    }
}