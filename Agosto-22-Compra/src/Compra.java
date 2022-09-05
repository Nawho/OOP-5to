import java.util.ArrayList;
import java.util.UUID;

public class Compra
{
	private final String 				id_compra;
	private ArrayList<Periferico> 		componentes;
	private Cliente 					cliente;
	private MetodoPago 					metodo_pago;

	private TarjetaAsociada 			tarjeta;

	public Compra() {
		this.id_compra 		= UUID.randomUUID().toString();
		this.componentes	= new ArrayList<>();
		this.cliente		= null;
		this.metodo_pago	= null;
		this.tarjeta        = null;
	}

	public Compra( Cliente cliente, MetodoPago metodo_pago ) {
		this.id_compra 		= UUID.randomUUID().toString();
		this.componentes	= new ArrayList<>();
		this.cliente 		= cliente;
		this.metodo_pago 	= metodo_pago;
		this.tarjeta = null;
	}

	public Compra( ArrayList<Periferico> componentes, Cliente cliente, MetodoPago metodo_pago ) {
		this.id_compra		= UUID.randomUUID().toString();
		this.componentes	= componentes;
		this.cliente		= cliente;
		this.metodo_pago	= metodo_pago;
		this.tarjeta = null;
	}

	public Compra( ArrayList<Periferico> componentes, Cliente cliente, MetodoPago metodo_pago, TarjetaAsociada tarjeta ) {
		this.id_compra		= UUID.randomUUID().toString();
		this.componentes	= componentes;
		this.cliente		= cliente;
		this.metodo_pago	= metodo_pago;
		this.tarjeta = tarjeta;
	}

	public String get_id_compra()					{ return id_compra; }
	public ArrayList<Periferico> get_componentes()	{ return componentes; }
	public Cliente get_cliente()					{ return cliente; }
	public MetodoPago get_metodo_pago()				{ return metodo_pago; }

	public void set_cliente( Cliente c )					{ this.cliente = c; }
	public void set_metodo_pago( MetodoPago m )				{ this.metodo_pago = m; }
	public void set_componentes( ArrayList<Periferico> p )	{ this.componentes = p; }
	public void add_componente( Periferico p )				{ this.componentes.add(p); }
}
