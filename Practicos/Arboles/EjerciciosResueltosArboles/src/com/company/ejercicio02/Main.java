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

        amplitud(nodo1);
    }

    public static void amplitud(NodoABinario nab){

        Cola cola, colaAux;
        NodoABinario aux;

        if (nab != null){
            cola = new Cola();
            colaAux = new Cola();
            cola.encolar(nab); // este es el nodo raiz

            while (!cola.vacia()){
                colaAux.encolar(aux=cola.desencolar());
                if (aux.izq != null){
                    cola.encolar(aux.izq);
                }
                if (aux.der != null){
                    cola.encolar(aux.der);
                }
            }
            colaAux.imprimir();
        }
    }
}
