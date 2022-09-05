public class Teclado extends Periferico
{
	private boolean es_mecanico;
	public Teclado() {
		super( TipoPeriferico.ENTRADA, "HyperX", "Alloy FPS MX Brown", 6000.0, 1000, new Puerto[] { Puerto.USB } );
		this.es_mecanico = true;
	}

	public Teclado( String nf, String m, double pv, int s, Puerto[] p, boolean mec ) {
		super( TipoPeriferico.ENTRADA, nf, m, pv, s, p );
		this.es_mecanico = mec;
	}

	public boolean es_mecanico()			{ return es_mecanico; }
	public void set_mecanico( boolean em )	{ this.es_mecanico = em; }
}
