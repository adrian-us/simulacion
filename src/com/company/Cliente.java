package com.company;

import menu.Menu;
import menu.Producto;
import java.util.ArrayList;
import java.util.Random;

public class Cliente {
    private int identificador;
    private Menu menu;
    private int paciencia = 0;
    private Pedido pedido;
    public int contador = 0;

    public Cliente(int identificador, Menu menu){
        this.identificador = identificador;
        this.menu = menu;
        paciencia = generarAleatorio(10,45); // una paciencia de entre a 10 a 45 "ticks"
        pedido = new Pedido(crearPedido(),identificador,menu);
    }

    private static int generarAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    private ArrayList<Producto> crearPedido() {
        ArrayList<Producto> orden = new ArrayList<>();
        for (int i = 0; i < generarAleatorio(1,6); i++) { /* Un cliente puede pedir de 1 a 5 productos */
            switch (generarAleatorio(1,4)) {
                case 1:
                    orden.add(menu.getPlatosFuertes().get(new Random().nextInt(4)));
                    break;
                case 2:
                    orden.add(menu.getAcompanamientos().get(new Random().nextInt(4)));
                    break;
                case 3:
                    orden.add(menu.getBebidas().get(new Random().nextInt(4)));
                    break;
                default:
                    System.out.println("Error en Cliente, caso fuera de 1,2 o 3");
                    break;
            }
        }
        return orden;
    }

    public void imprimirPedido() {
        System.out.println("Cliente [ " + identificador + " ] Tamano de la orden : " + pedido.orden.size());
        pedido.imprimirPedido();
    }

    /* Getters */

    public int getIdentificador(){
        return this.identificador;
    }
    public int getPaciencia(){
        return this.paciencia;
    }
    public Pedido getPedido(){
        return this.pedido;
    }
    public int getContador(){
        return this.contador;
    }
}
