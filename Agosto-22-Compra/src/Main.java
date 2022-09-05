public class Main
{
	public static void main(String[] args) {
		Cliente cliente = new Cliente( "el papu", "perez", 11025316 );

		Periferico[] perifericos = new Periferico[] { new CPU(), new Teclado(), new Mouse(), new Impresora(), new Monitor() };

		TarjetaAsociada tarjeta = new TarjetaAsociada( 1465, 3126, 7985, 6433, "Santander", TarjetaAsociada.TipoTarjeta.DEBITO );

		Sistema sistema = new Sistema();

		sistema.add_cliente( cliente );

		for (Periferico p : perifericos) {
			sistema.add_componente(p);
			cliente.add_componente(p);
		}
		try {
			sistema.comprar(cliente, MetodoPago.TARJETA, tarjeta);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
