package menu;

public class Bebida extends Producto {

    protected final boolean caliente;
    protected final int tamano;

    public Bebida(final String nombre,
                  final int precio,
                  final int tiempoProduccion,
                  final int espacioProduccion,
                  final boolean caliente,
                  final int tamano) {
        super(nombre,precio,tiempoProduccion,espacioProduccion);
        this.caliente = caliente;
        this.tamano = tamano;
    }

    public boolean isCaliente(){
        return this.caliente;
    }
    public int getTamano(){
        return this.tamano;
    }


    @Override
    public void imprimir() {
        System.out.println("Bebida | Nombre : " + this.nombre + " Precio : " + this.precio + " Tiempo Produccion : " + this.tiempoProduccion + " Es caliente : " + this.caliente + " Tamano :" + this.tamano);
    }
}
