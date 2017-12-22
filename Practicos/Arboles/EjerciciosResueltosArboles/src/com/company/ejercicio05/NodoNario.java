package com.company.ejercicio05;

import java.util.LinkedList;
/**
 * Created by arcangel on 11/11/16.
 */
public class NodoNario {
    public String valor;

    public LinkedList hijos;

    public NodoNario(String valor) {
        this.valor = valor;
        this.hijos = new LinkedList();
    }

    @Override
    public String toString() {
        return this.valor;
    }
}
