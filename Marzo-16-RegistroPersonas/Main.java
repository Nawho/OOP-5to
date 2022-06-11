import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SistemaDeRegistroDePersonas registro = new SistemaDeRegistroDePersonas();
        Menu menu = new Menu();

        menu.mainLoop(registro);
    }
}

