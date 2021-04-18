package produccion;

import com.company.Pedido;
import menu.Producto;
import java.util.LinkedList;
import java.util.Queue;

public class Produccion {
    private Queue<Pedido> pedidos = new LinkedList<>();
    private Queue<Producto> produccion = new LinkedList<>();
    private Queue<Producto> producidos = new LinkedList<>();
    private Queue<Pedido> pedidosPreparados = new LinkedList<>();
    int espacioOcupado = 0;

    public Produccion() {}

    /* Metodos */

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
        for (Producto producto : pedido.orden) {
            if (espacioOcupado + producto.getEspacioProduccion() <= 10) {
                produccion.add(producto);
                espacioOcupado += producto.getEspacioProduccion();
                System.out.println("Producto : " + producto.getNombre() + " agregado! Espacio ocupado [" + espacioOcupado + "]");
            } else {
                System.out.println("Espacio ocupado [" + espacioOcupado + "] no se puede agregar : "
                        + producto.getNombre() + " espacio [" + producto.getEspacioProduccion() + "]");
            }
        }
    }

    public void revisarPedidos() {
        for (Pedido pedido : pedidos) {
            boolean pedidoPreparadoLocal = true;
            for (Producto producto : pedido.orden) {
                if (!producto.isPreparado())
                    pedidoPreparadoLocal = false;
            }
            if (pedidoPreparadoLocal)
                pedido.setPedidoPreparado(true);
            if (pedido.isPedidoPreparado()) {
                pedidosPreparados.add(pedido);
            }
        }
    }

    public void Producir() {
        Producto productoAPreparar = produccion.peek();
        if (productoAPreparar.isPreparado()) {
            System.out.println("Producto : " + productoAPreparar.getNombre() + " del pedido " );
            producidos.add(produccion.poll());

        }
        if (productoAPreparar.getTiempoProduccion() == 0)
            productoAPreparar.setPreparado(true);
        else if (productoAPreparar.getTiempoProduccion() > 0)
            productoAPreparar.setTiempoProduccion(productoAPreparar.getTiempoProduccion() - 1);
    }

}
