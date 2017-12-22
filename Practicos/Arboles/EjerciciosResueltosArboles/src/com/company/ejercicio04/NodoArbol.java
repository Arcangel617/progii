package com.company.ejercicio04;

/**
 * Created by arcangel on 11/11/16.
 */
public class NodoArbol {
    public int valor;

    public NodoArbol izq;
    public NodoArbol der;

    public NodoArbol(int valor) {
        this.valor = valor;
        this.izq = null;
        this.der = null;
    }

    @Override
    public String toString() {
        return ""+valor+"";
    }
}
