import java.util.UUID;

public abstract class Periferico
{
	private final String	id;
	private TipoPeriferico	tipo;
	private String 			nombre_fabricante;
	private String 			modelo;
	private Double 			precio_venta;
	private Integer 		stock;
	private Puerto[]		puertos;

	public Periferico( TipoPeriferico t, String nf, String m, double pv, int s, Puerto[] p ) {
		this.id					= UUID.randomUUID().toString();
		this.tipo				= t;
		this.nombre_fabricante	= nf;
		this.modelo 			= m;
		this.precio_venta 		= pv;
		this.stock 				= s;
		this.puertos			= p;
	}

	public String get_id()						{ return id; }
	public String get_nombre_fabricante()		{ return nombre_fabricante; }
	public String get_modelo()					{ return modelo; }
	public Double get_precio_venta()			{ return precio_venta; }
	public Integer get_stock()					{ return stock; }
	public TipoPeriferico get_tipo()			{ return tipo; }

	public void set_nombre_fabricante(String f)	{ this.nombre_fabricante = f; }
	public void set_modelo(String m)			{ this.modelo = m; }
	public void set_precio_venta(double pv)		{ this.precio_venta = pv; }
	public void set_stock(int s)				{ this.stock = s; }
	public void set_tipo(TipoPeriferico t)		{ this.tipo = t; }

	public void comprar()						{ this.stock -= 1; }

	public enum TipoPeriferico
	{
		ENTRADA,
		SALIDA,
		CPU
	}
}
