package com.company;

import java.util.ArrayList;

public class ListaAdyacencia {
    private ArrayList<Nodo> lista = new ArrayList<>();


    public void agregarVertice(Nodo vertice){
        this.lista.add(vertice);
    }

    public void agregarNodoAdyacente(Nodo vertice, Nodo siguiente){
        this.lista.get(this.lista.indexOf(vertice)).siguiente(siguiente);
    }

    public void remover(Nodo vertice){
        this.lista.remove(vertice);
    }

    public void imprimir() {
        for (Nodo v : lista) {
            System.out.println(v.info);
        }
    }
}
