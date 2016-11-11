package com.company.ejercicio02;

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

        preorden(nodo1);
    }

    public static void preorden(NodoABinario nab){
        if (nab != null){
            System.out.print(nab.toString()+" ");
            preorden(nab.izq);
            preorden(nab.der);
        }
    }
}
