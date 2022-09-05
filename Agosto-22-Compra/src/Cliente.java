import java.util.ArrayList;

public class Cliente
{
	private final String[] nombre_y_apellido;
	private final String celular;
	private ArrayList<Periferico> carrito;

	public Cliente( String nombre, String apellido, String celular ) {
		this.nombre_y_apellido = new String[] { nombre, apellido };
		this.celular = celular;
		this.carrito = new ArrayList<>();
	}

	public Cliente( String nombre, String apellido, int celular ) {
		this.nombre_y_apellido = new String[] { nombre, apellido };
		this.celular = String.valueOf( celular );
		this.carrito = new ArrayList<>();
	}

	public String[] get_nombre_y_apellido()			{ return nombre_y_apellido; }
	public String get_celular()						{ return celular; }

	public ArrayList<Periferico> get_carrito()		{ return carrito; }

	public void add_componente(Periferico p)		{ this.carrito.add(p); }

	public void remove_componente(Periferico p)		{ this.carrito.remove(p); }

	public void remove_componente_by_id(String id)	{
		this.carrito = (ArrayList<Periferico>) this.carrito.stream().filter(periferico -> !periferico.get_id().equals(id));
	}

	public void clear_carrito()						{ this.carrito.clear(); }
}
