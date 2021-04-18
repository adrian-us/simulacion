package menu;

public abstract class Producto {
    protected final String nombre;
    protected final int precio;
    protected final int espacioProduccion;
    protected boolean preparado = false;
    protected int tiempoProduccion;
    protected int identificador = -1;

    public Producto(final String nombre,
                    final int precio,
                    final int tiempoProduccion,
                    final int espacioProduccion) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoProduccion = tiempoProduccion;
        this.espacioProduccion = espacioProduccion;
    }

    /* Getters */

    public String getNombre(){
        return this.nombre;
    }
    public int getPrecio(){
        return this.precio;
    }
    public int getTiempoProduccion(){
        return this.tiempoProduccion;
    }
    public int getEspacioProduccion(){
        return this.espacioProduccion;
    }
    public boolean isPreparado(){
        return preparado;
    }

    /* Setters */

    public void setPreparado(boolean preparado) {
        this.preparado = preparado;
    }
    public void setTiempoProduccion(int tiempoProduccion) { this.tiempoProduccion = tiempoProduccion; }
    public void setIdentificador(int identificador) { this.identificador = identificador; }
    /* Metodos */

    public abstract void imprimir();
}
