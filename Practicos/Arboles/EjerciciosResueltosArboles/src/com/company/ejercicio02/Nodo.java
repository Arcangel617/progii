package com.company.ejercicio02;

import com.company.NodoABinario;

/**
 * Created by arcangel on 11/11/16.
 */
public class Nodo {

    public Nodo anterior;
    public Nodo siguiente;
    public NodoABinario valor;

    public Nodo(NodoABinario valor) {
        this.valor = valor;
        this.anterior = null;
        this.siguiente = null;
    }

    // toString() retorna el valor del nodo.
    @Override
    public String toString() {
        return this.valor.toString();
    }
}