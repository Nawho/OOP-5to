import java.time.LocalDate;
import java.util.Arrays;

public abstract class Electrodomestico {
    public double precio;
    public double peso;
    public ConsumoElectrico claseConsumo;
    public Color color;


    public Electrodomestico() {
        this.precio = 5000;
        this.peso = 5;
        this.color = Color.BLANCO;
        this.claseConsumo = ConsumoElectrico.F;
    }

    public Electrodomestico(double precio, double peso) {
        this.precio = precio;
        this.peso = peso;
        this.color = Color.BLANCO;
        this.claseConsumo = ConsumoElectrico.F;
    }

    public Electrodomestico(double precio, double peso, ConsumoElectrico claseConsumo, Color color) {
        this.precio = precio;
        this.peso = peso;
        this.claseConsumo = claseConsumo;
        this.color = color;
    }

    public ConsumoElectrico getClaseConsumo() {
        return claseConsumo;
    }

    public double get_precio() { return this.precio; }

    public void comprobarConsumoEnergetico(ConsumoElectrico letraAComprobar) {
        if ( Arrays.stream(ConsumoElectrico.values()).toList().contains(letraAComprobar)) {
            this.claseConsumo = letraAComprobar;

        } else {
            this.claseConsumo = ConsumoElectrico.F;
        }
    }

    public void comprobarColor(Color colorAComprobar) {
        if ( Arrays.stream(Color.values()).toList().contains(colorAComprobar)) {
            this.color = colorAComprobar;

        } else {
            this.color = Color.BLANCO;
        }
    }

    public int precioPorConsumo() {
        switch (claseConsumo) {
            case A -> { return 1000; }
            case B -> { return 800; }
            case C -> { return 600; }
            case D -> { return 400; }
            case E -> { return 350; }
            case F -> { return 150; }
            default -> { return 0; }
        }
    }


    public int precioPorPeso() {
        if (peso < 20) {
            return 1000;
        } else if (peso < 50) {
            return 5000;
        } else if (peso < 80) {
            return 8000;
        }
        return 10000;
    }

    public double precioFinal() {
        return this.precio + precioPorConsumo() + precioPorPeso();
    }


}
