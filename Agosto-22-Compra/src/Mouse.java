public class Mouse extends Periferico
{
	public Mouse() {
		super( TipoPeriferico.ENTRADA, "Logitech", "G502 Hero", 5000.0, 1000, new Puerto[] { Puerto.USB } );
	}

	public Mouse( String nf, String m, double pv, int s, Puerto[] p ) {
		super( TipoPeriferico.ENTRADA, nf, m, pv, s, p);
	}
}
