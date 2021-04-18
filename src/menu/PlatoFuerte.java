package menu;

public class PlatoFuerte extends Producto {

    private final boolean entero;

    public PlatoFuerte(final String nombre,
                       final int precio,
                       final int tiempoProduccion,
                       final int espacioProduccion,
                       final boolean entero) {
        super(nombre, precio, tiempoProduccion, espacioProduccion);
        this.entero = entero;
    }

    public boolean isEntero(){
        return this.entero;
    }


    @Override
    public void imprimir() {
        System.out.println("Plato fuerte | Nombre : " + this.nombre + " Precio : " + this.precio + " Tiempo Produccion : " + this.tiempoProduccion + " Es entero : " + this.entero);
    }
}
