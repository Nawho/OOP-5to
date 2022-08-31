public class AireAcondicionado extends Electrodomestico
{
    private boolean inverter;
    private boolean es_frio_calor;

    public AireAcondicionado() {
        super();
        this.inverter       = false;
        this.es_frio_calor  = false;
    }

    public AireAcondicionado( double precio, double peso, ConsumoElectrico consumo, Color color, boolean inverter, boolean es_frio_calor ) {
        super( precio, peso, consumo, color );
        this.inverter = inverter;
        this.es_frio_calor = es_frio_calor;
    }

    public boolean is_inverter()            { return this.inverter; }
    public boolean is_frio_calor()          { return es_frio_calor; }

    public void set_inverter(boolean inv)   { this.inverter = inv; }
    public void set_frio_calor(boolean fc)  { this.es_frio_calor = fc; }

    @Override
    public double precioFinal() {
        double precio = get_precio() + precioPorConsumo() + precioPorPeso();

        return precio + ((inverter) ? (precio * 0.25) : 0) + ((es_frio_calor) ? (precio * 0.15) : 0);
    }
}
