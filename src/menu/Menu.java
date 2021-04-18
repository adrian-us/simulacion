package menu;

import java.util.ArrayList;

public class Menu {
    ArrayList<PlatoFuerte> platosFuertes;
    ArrayList<Acompanamiento> acompanamientos;
    ArrayList<Bebida> bebidas;
    ArrayList<Combo> combos;

    public Menu(ArrayList<PlatoFuerte> platosFuertes,
                ArrayList<Acompanamiento> acompanamientos,
                ArrayList<Bebida> bebidas,
                ArrayList<Combo> combos) {
        this.platosFuertes = platosFuertes;
        this.acompanamientos = acompanamientos;
        this.bebidas = bebidas;
        this.combos = combos;
    }

    public void imprimirMenu() {
        System.out.println("\n\n\t=========== Platos Fuertes ===========\n\n");
        for (PlatoFuerte platoFuerte : platosFuertes) {
            System.out.println("Nombre : " + platoFuerte.getNombre());
            System.out.println("Precio : " + platoFuerte.getPrecio());
            System.out.println("Tiempo de produccion : " + platoFuerte.getTiempoProduccion());
            System.out.println("Es entero : " + platoFuerte.isEntero() + "\n");
        }
        System.out.println("\n\n\t=========== Acompanamientos ===========\n\n");
        for (Acompanamiento acompanamiento : acompanamientos) {
            System.out.println("Nombre : " + acompanamiento.getNombre());
            System.out.println("Precio : " + acompanamiento.getPrecio());
            System.out.println("Tiempo de produccion : " + acompanamiento.getTiempoProduccion());
            System.out.println("Es salado : " + acompanamiento.isSalado() + "\n");
        }
        System.out.println("\n\n\t=========== Bebidas ===========\n\n");
        for (Bebida bebida : bebidas) {
            System.out.println("Nombre : " + bebida.getNombre());
            System.out.println("Precio : " + bebida.getPrecio());
            System.out.println("Tiempo de produccion : " + bebida.getTiempoProduccion());
            System.out.println("Es caliente : " + bebida.isCaliente());
            System.out.println("Tamano : " + bebida.getTamano()+ "\n");
        }
        System.out.println("\n\n\t=========== Combos ===========\n\n");
        for (Combo combo : combos) {
            System.out.println("Nombre : " + combo.getNombre());
            System.out.println("Precio : " + combo.getPrecio());
            System.out.println("\tPlato fuerte : " + combo.getPlatoFuerte().getNombre());
            System.out.println("\tAcompanamiento : " + combo.getAcompanamiento().getNombre());
            System.out.println("\tBebida fuerte : " + combo.getBebida().getNombre());
        }
        System.out.println("\n\n");
    }

    /* Getters */
    public ArrayList<PlatoFuerte> getPlatosFuertes(){
        return this.platosFuertes;
    }
    public ArrayList<Acompanamiento> getAcompanamientos(){
        return this.acompanamientos;
    }
    public ArrayList<Bebida> getBebidas(){
        return this.bebidas;
    }
    public ArrayList<Combo> getCombos() { return this.combos; }
}
