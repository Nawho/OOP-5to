public class Lavarropa extends Electrodomestico
{
    private Double carga_ropa_soportada;

    public Lavarropa() {
        super();
        this.carga_ropa_soportada = 5.0;
    }

    public Lavarropa( double precio, double peso, ConsumoElectrico consumo, Color color, double carga_ropa_soportada ) {
        super( precio, peso, consumo, color );
        this.carga_ropa_soportada = carga_ropa_soportada;
    }

    public Double get_carga_ropa_soportada()        { return carga_ropa_soportada; }
    public void set_carga_ropa_soportada(double nc) { if (nc > 5) this.carga_ropa_soportada = nc; }

    public Double precio_final() {
        return this.precioFinal() + (( this.carga_ropa_soportada > 30 ) ? 2300 : 0);
    }

    @Override
    public double precioFinal() {
        double precio = get_precio() + precioPorConsumo() + precioPorPeso();

        return precio + ((carga_ropa_soportada > 30) ? 2300 : 0);
    }
}
