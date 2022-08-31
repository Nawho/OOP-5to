public class TV extends Electrodomestico
{
    private Float resolucion;
    private boolean es_smart;

    public TV() {
        super();
        this.resolucion = 55f;
        this.es_smart = false;
    }

    public TV( double precio, double peso, ConsumoElectrico consumo, Color color, float resolucion, boolean es_smart ) {
        super( precio, peso, consumo, color );
        this.resolucion = resolucion;
        this.es_smart = es_smart;
    }

    public boolean is_smart()           { return this.es_smart; }
    public Float get_resolucion()       { return this.resolucion; }

    public void set_smart(boolean i)    { this.es_smart = i; }
    public void set_resolucion(float i) { this.resolucion = i; }

    @Override
    public double precioFinal() {
        double precio = get_precio() + precioPorConsumo() + precioPorPeso();

        return precio + ((resolucion > 55) ? (precio * 0.25) : 0) + ((es_smart) ? 12340 : 0);
    }
}
