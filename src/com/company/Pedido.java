package com.company;

import menu.Menu;
import menu.Producto;
import java.util.ArrayList;

public class Pedido {
    private Menu menu;
    private int identificador;
    private int tiempoProduccion;
    private double precioTotal = 0.0;
    private boolean pedidoPreparado = false;
    public ArrayList<Producto> orden;

    public Pedido(final ArrayList<Producto> orden, final int identificador, Menu menu) {
        this.orden = orden;
        this.identificador = identificador;
        this.menu = menu;
        asignarIdentificador();
        calcularPrecio();
    }

    //  Metodos

    public int getIdentificador(){
        return this.identificador;
    }

    public int getTiempoProduccion(){
        return this.tiempoProduccion;
    }

    public double getPrecioTotal(){
        return this.precioTotal;
    }

    public boolean isPedidoPreparado() { return this.pedidoPreparado; }

    public void setPedidoPreparado(boolean pedidoPreparado) {
        this.pedidoPreparado = pedidoPreparado;
    }

    public void asignarIdentificador() {
        for (Producto producto : orden) {
            producto.setIdentificador(identificador);
        }
    }

    public void imprimirPedido() {
        for (int i = 0; i < orden.size(); i++) {
            System.out.println("\t Producto : " + i + " " + orden.get(i).getNombre());
        }
        if (existeComboHamburguesa())
            System.out.println("Existe combo de Hamburguesa !");
        if (existeComboSandwich())
            System.out.println("Existe combo de Sandwich !");
        if (existeComboWrap())
            System.out.println("Existe combo de Wrap !");
    }

    private boolean existeComboHamburguesa(){
        if (orden.contains(menu.getPlatosFuertes().get(0)) && orden.contains(menu.getAcompanamientos().get(0)) && orden.contains(menu.getBebidas().get(0))) {
            return true;
        }
        return false;
    }

    private boolean existeComboSandwich(){
        if (orden.contains(menu.getPlatosFuertes().get(1)) && orden.contains(menu.getAcompanamientos().get(1)) && orden.contains(menu.getBebidas().get(2))) {
            return true;
        }
        return false;
    }

    private boolean existeComboWrap(){
        if (orden.contains(menu.getPlatosFuertes().get(3)) && orden.contains(menu.getAcompanamientos().get(3)) && orden.contains(menu.getBebidas().get(3))) {
            return true;
        }
        return false;
    }

    private void calcularPrecio(){
        if (existeComboHamburguesa()) {
            /* Sumo el precio total de cada producto */
            for (Producto producto : orden) precioTotal += producto.getPrecio();
            /* Remuevo los precios de cada producto que pertence al combo */
            precioTotal -= orden.get(orden.indexOf(menu.getPlatosFuertes().get(0))).getPrecio();
            precioTotal -= orden.get(orden.indexOf(menu.getAcompanamientos().get(0))).getPrecio();
            precioTotal -= orden.get(orden.indexOf(menu.getBebidas().get(0))).getPrecio();
            /* Agrego el precio combinado del combo 'Combo de Hamburguesa' */
            precioTotal += menu.getCombos().get(0).getPrecio();
        }
        if (existeComboSandwich()) {
            for (Producto producto : orden) precioTotal += producto.getPrecio();
            precioTotal -= orden.get(orden.indexOf(menu.getPlatosFuertes().get(1))).getPrecio();
            precioTotal -= orden.get(orden.indexOf(menu.getAcompanamientos().get(1))).getPrecio();
            precioTotal -= orden.get(orden.indexOf(menu.getBebidas().get(2))).getPrecio();
            precioTotal += menu.getCombos().get(1).getPrecio();
        }
        if (existeComboWrap()) {
            for (Producto producto : orden) precioTotal += producto.getPrecio();
            precioTotal -= orden.get(orden.indexOf(menu.getPlatosFuertes().get(3))).getPrecio();
            precioTotal -= orden.get(orden.indexOf(menu.getAcompanamientos().get(3))).getPrecio();
            precioTotal -= orden.get(orden.indexOf(menu.getBebidas().get(3))).getPrecio();
            precioTotal += menu.getCombos().get(2).getPrecio();
        } else { /* Si no existe ningun combo, entonces solo sumo el precio total de cada producto */
            for (Producto producto : orden) precioTotal += producto.getPrecio();
        }
    }

}
