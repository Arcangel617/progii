package com.company.ejercicio01;

import com.company.NodoABinario;

/**
 * Created by arcangel on 11/11/16.
 */
public class Main {
    public static void main(String [] args){

        NodoABinario nodo1 = new NodoABinario("4");
        NodoABinario nodo2 = new NodoABinario("2");
        NodoABinario nodo3 = new NodoABinario("5");
        NodoABinario nodo4 = new NodoABinario("1");
        NodoABinario nodo5 = new NodoABinario("3");
        NodoABinario nodo6 = new NodoABinario("6");

        nodo1.izq = nodo2;
        nodo1.der = nodo3;

        nodo2.izq = nodo4;
        nodo2.der = nodo5;

        nodo3.der = nodo6;

        System.out.println(nodo1);
        System.out.println(nodo2);
        System.out.println(nodo3);
        System.out.println(nodo4);
        System.out.println(nodo5);
        System.out.println(nodo6);

    }
}
