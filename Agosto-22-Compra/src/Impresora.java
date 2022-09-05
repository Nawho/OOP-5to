public class Impresora extends Periferico
{
    private TipoImpresion tipo_impresion;

    public Impresora() {
        super( TipoPeriferico.SALIDA, "EPSON", "XP207", 59999.0, 0, new Puerto[] { Puerto.USB } );
        this.tipo_impresion = TipoImpresion.INYECCION;
    }

    public Impresora(TipoPeriferico t, String nf, String m, double pv, int s, Puerto[] p, TipoImpresion tipo_impresion) {
        super(t, nf, m, pv, s, p);
        this.tipo_impresion = tipo_impresion;
    }

    public enum TipoImpresion {
        INYECCION,
        LASER
    }
}
