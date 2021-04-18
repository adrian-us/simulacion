package menu;

public class Acompanamiento extends Producto {

    protected final boolean salado;

    public Acompanamiento(final String nombre,
                          final int precio,
                          final int tiempoProduccion,
                          final int espacioProduccion,
                          final boolean salado) {
        super(nombre, precio, tiempoProduccion, espacioProduccion);
        this.salado = salado;
    }

    public boolean isSalado(){
        return this.salado;
    }

    @Override
    public void imprimir() {
        System.out.println("Acompanamiento | Nombre : " + this.nombre + " Precio : " + this.precio + " Tiempo Produccion : " + this.tiempoProduccion + " Es salado : " + this.salado);
    }
}
