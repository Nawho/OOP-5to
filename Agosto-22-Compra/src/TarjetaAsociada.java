public class TarjetaAsociada
{
	private final String numero_tarjeta;	// Hay que guardarlo como String porque no entra como Integer
	private final String banco;
	private final TipoTarjeta tipo;

	public TarjetaAsociada( String numero_tarjeta, String banco, TipoTarjeta tipo ) {
		this.numero_tarjeta = numero_tarjeta;
		this.banco = banco;
		this.tipo = tipo;
	}

	public TarjetaAsociada( int n1, int n2, int n3, int n4, String banco, TipoTarjeta tipo ) {
		this.numero_tarjeta = Utils.numbers_to_string(n1, n2, n3, n4);
		this.banco = banco;
		this.tipo = tipo;
	}

	public String get_numero_tarjeta()		{ return numero_tarjeta; }
	public String get_banco()				{ return banco; }

	public enum TipoTarjeta
	{
		CREDITO,
		DEBITO
	}
}
