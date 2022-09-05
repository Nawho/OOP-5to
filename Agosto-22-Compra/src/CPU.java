public class CPU extends Periferico
{
    public CPU() {
        super( TipoPeriferico.CPU, "Intel", "Intel i7 11079", 81835.0, 1000, new Puerto[] {} );
    }

    public CPU( String nf, String m, double pv, int s, Puerto[] p ) {
        super( TipoPeriferico.CPU, nf, m, pv, s, p );
    }
}
