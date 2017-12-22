package com.company;

public class Nodo {
    int info;
    Nodo siguiente;

    public Nodo(int info){
        this.info = info;
        this.siguiente = null;
    }

    public void siguiente(Nodo nodo){
        this.siguiente = nodo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
}
