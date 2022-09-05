import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;

import static java.util.stream.Stream.empty;

public class Sistema
{
    private HashSet<Cliente>    clientes;
    private HashSet<Periferico> componentes;
    private HashSet<Compra>     compras;

    public Sistema() {
        this.clientes       = new HashSet<>();
        this.componentes    = new HashSet<>();
        this.compras        = new HashSet<>();
    }

    public HashSet<Cliente> get_clientes() {
        return clientes;
    }

    public HashSet<Periferico> get_componentes() {
        return componentes;
    }

    public HashSet<Compra> get_compras() {
        return compras;
    }

    public void set_clientes(HashSet<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void set_componentes(HashSet<Periferico> componentes) {
        this.componentes = componentes;
    }

    public void set_compras(HashSet<Compra> compras) {
        this.compras = compras;
    }

    public void add_cliente(Cliente c) {
        this.clientes.add(c);
    }

    public void add_componente(Periferico p) {
        this.componentes.add(p);
    }

    public void add_compra(Compra c) {
        this.compras.add(c);
    }

    public boolean comprar( Cliente cliente, MetodoPago metodo_pago, TarjetaAsociada tarjetaAsociada ) throws NoStockException {
        // Si todos los perifericos son validos
        for ( Periferico p : cliente.get_carrito() ) if ( !this.componentes.contains(p) ) return false;

        // Si hay stock de todos los productos
        for (Periferico p : cliente.get_carrito()) {
            if (p.get_stock() <= 0) {
                System.err.println("NOT ENOUGH STOCK TO BUY");
                throw new NoStockException();
            }
        }

        // Si cumple los requisitos de una compra minima
        boolean[] has_minimum_items = { false, false, false };
        for ( Periferico periferico : cliente.get_carrito() ) {
            if ( periferico.get_tipo() == Periferico.TipoPeriferico.CPU )       has_minimum_items[0] = true;
            if ( periferico.get_tipo() == Periferico.TipoPeriferico.ENTRADA )   has_minimum_items[1] = true;
            if ( periferico.get_tipo() == Periferico.TipoPeriferico.SALIDA )    has_minimum_items[2] = true;
        }

        if ( !Arrays.equals( has_minimum_items, new boolean[] { true, true, true } ) ) {
            System.out.println("\033[0;31mINCOMPLETE ORDER\033[0m");
            throw new NotMinimumPurchaseException();
        }

        // Realizar la compra
        System.out.printf("El costo total es: %d\n", precio_total_computadora(cliente.get_carrito(), metodo_pago));

        for ( Periferico periferico : cliente.get_carrito() ) periferico.comprar();

        this.compras.add( new Compra( (ArrayList<Periferico>) cliente.get_carrito().clone(), cliente, metodo_pago, tarjetaAsociada ) );
        return true;
    }

    public int precio_total_computadora( ArrayList<Periferico> perifericos, MetodoPago metodo_pago ) {
        int precio_total = 0;

        for ( Periferico p : perifericos ) {
            precio_total += p.get_precio_venta() + ( p.get_precio_venta() * ((metodo_pago == MetodoPago.TARJETA) ? 0.5f : 0.0f) );
        }

        return precio_total;
    }

    public HashMap<Periferico.TipoPeriferico, Integer> obtener_cantidad_perifericos_por_tipo( ArrayList<Periferico> perifericos ) {
        HashMap<Periferico.TipoPeriferico, Integer> apariciones = new HashMap<>();

        for ( Periferico p : perifericos ) {
            if ( p.get_tipo() == Periferico.TipoPeriferico.CPU ) continue;

            apariciones.put( p.get_tipo(), apariciones.get( p.get_tipo() ) + 1 );
        }

        return apariciones;
    }
}
