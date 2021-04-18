package com.company;

import com.google.gson.Gson;
import menu.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Prueba\n");

        Menu menu2 = deserializarMenu();
//        menu2.imprimirMenu();

//        ArrayList<Cliente> listaClientes = crearColaClientes(25,menu2);
//        for (Cliente cliente : listaClientes) {
//            System.out.println("Cliente : " + cliente.getIdentificador() + "\tPaciencia : " + cliente.getPaciencia());
//
//        }
//

    }


    private static Menu deserializarMenu() throws FileNotFoundException {
        Gson gson = new Gson();
        return gson.fromJson(new FileReader("src/jsons/menu.json"),Menu.class);
    }

    private static ArrayList<Cliente> crearColaClientes(int cantidadClientes, Menu menu) {
        ArrayList<Cliente> lista = new ArrayList<>();
        for (int i = 0; i < cantidadClientes; i++) {
            lista.add(new Cliente(i,menu));
        }
        return lista;
    }
}
