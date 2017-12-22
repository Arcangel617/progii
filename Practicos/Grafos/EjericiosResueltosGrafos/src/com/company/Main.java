package com.company;

public class Main {

    public static void main(String[] args) {

        ListaAdyacencia la = new ListaAdyacencia();
        la.agregarVertice(new Nodo(1));
        la.agregarVertice(new Nodo(2));
        la.agregarVertice(new Nodo(3));
        la.agregarVertice(new Nodo(4));
        la.agregarVertice(new Nodo(5));
        la.imprimir();
        System.out.println();

        MatrizAdyacencia matriz = new MatrizAdyacencia(6);

        // grafo dirigido
        matriz.agregar(0, 1);
        matriz.agregar(1, 2);
        matriz.agregar(1, 5);
        matriz.agregar(3, 4);
        matriz.agregar(4, 1);
        matriz.agregar(5, 1);

        matriz.imprimir();
        System.out.println();

        MatrizAdyacencia matriz2 = new MatrizAdyacencia(3);

        // grafo no dirigido con bucle
        matriz2.agregar(0, 0);
        matriz2.agregar(0, 1);
        matriz2.agregar(0, 1);
        matriz2.agregar(0, 2);
        matriz2.agregar(0, 2);

        matriz2.agregar(1, 0);
        matriz2.agregar(1, 0);
        matriz2.agregar(1, 2);
        matriz2.agregar(1, 2);

        matriz2.agregar(2, 0);
        matriz2.agregar(2, 0);
        matriz2.agregar(2, 1);
        matriz2.agregar(2, 1);

        matriz2.imprimir();
    }
}
