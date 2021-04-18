package menu;

public class Combo {
    protected final PlatoFuerte platoFuerte;
    protected final Acompanamiento acompanamiento;
    protected final Bebida bebida;
    protected final String nombre;
    protected double precio;

    public Combo(final PlatoFuerte platoFuerte,
                 final Acompanamiento acompanamiento,
                 final Bebida bebida,
                 final String nombre,
                 final double precio) {
        this.platoFuerte = platoFuerte;
        this.acompanamiento = acompanamiento;
        this.bebida = bebida;
        this.nombre = nombre;
        this.precio = precio;
    }

    /* Getters */
    public PlatoFuerte getPlatoFuerte(){
        return this.platoFuerte;
    }
    public Acompanamiento getAcompanamiento(){
        return this.acompanamiento;
    }
    public Bebida getBebida(){
        return this.bebida;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
}