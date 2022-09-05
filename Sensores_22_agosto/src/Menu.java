import stind.STIND;

public class Menu {
    private boolean executing;

    public Menu() {
        this.executing = true;
    }

    public Integer getInput() {
        STIND stind = new STIND(System.in);
        try {
            int input = stind.read_int().unwrap();
            return input;

        } catch (Exception err) {
            System.out.println(err);
        }
        return 0;
    }

    public void main(SensorSystem system) {
        while (this.executing) {
            System.out.println("Para obtener más información de un dispositivo, ingrese un número del 0 al " + (system.sensors.toArray().length - 1));
            System.out.println("Para salir, presione [E]");

            int input = getInput();
            try {
                System.out.println( system.sensors.get(input).toString() );
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Input invalido. Ingrese un número del 0 al " + (system.sensors.toArray().length - 1));
            }

        }

    }
}
