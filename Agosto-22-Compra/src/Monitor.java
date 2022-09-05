public class Monitor extends Periferico
{
    public Monitor() {
        super( TipoPeriferico.SALIDA, "EPSON", "XP207", 59999.0, 1000, new Puerto[] { Puerto.USB } );
    }

    public Monitor(TipoPeriferico t, String nf, String m, double pv, int s, Puerto[] p, Impresora.TipoImpresion tipo_impresion) {
        super(t, nf, m, pv, s, p);
    }
}
