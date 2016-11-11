package com.company.ejercicio03;

import com.company.NodoABinario;

/**
 * Un árbol binario puede utilizarse para almacenar una expresión algebraica, siendo las hojas
 * los operandos y los demás nodos los correspondientes operadores.
 * Crear un programa para cargar un árbol binario con los valores de la siguiente figura y luego
 * incluya un procedimiento recursivo que implemente uno de los tipos de recorridos sobre árboles
 * (pre-orden, in-orden o post-orden) que permita obtener el resultado de la expresión en notación
 * prefija ​ + * 1 3 - 1 6​ .
 *
 * @Author Artigue Arcangel Andres
 */
public class Main {
    public static void main(String [] args){

        // Primero se cargan los nodos
        NodoABinario nodo1 = new NodoABinario("+");
        NodoABinario nodo2 = new NodoABinario("*");
        NodoABinario nodo3 = new NodoABinario("-");
        NodoABinario nodo4 = new NodoABinario("1");
        NodoABinario nodo5 = new NodoABinario("3");
        NodoABinario nodo6 = new NodoABinario("1");
        NodoABinario nodo7 = new NodoABinario("6");

        // luego se asignan los hijos de acuerdo al grafico de la consigna
        nodo1.izq = nodo2;
        nodo1.der = nodo3;

        nodo2.izq = nodo4;
        nodo2.der = nodo5;

        nodo3.izq = nodo6;
        nodo3.der = nodo7;

        System.out.println("Pre-orden");
        preorden(nodo1);
        System.out.println(" -> Este es el recorrido adecuado");
        System.out.println("Post-orden");
        postorden(nodo1);
        System.out.println();
        System.out.println("In-orden");
        inorden(nodo1);
    }

    /**
     * En este tipo de recorrido se realiza cierta acción sobre el nodo actual
     * y posteriormente se trata el subárbol izquierdo y cuando se haya concluido,
     * el subárbol derecho.
     * Otra forma para entender el recorrido con este método seria seguir el orden:
     * nodo raíz, nodo izquierda, nodo derecha.
     * En el árbol de la figura el recorrido en preorden sería: 2, 7, 2, 6, 5, 11, 5, 9 y 4.
     *
     * @param nab
     */
    public static void preorden(NodoABinario nab){
        if (nab != null){
            System.out.print(nab.toString()+" ");
            preorden(nab.izq);
            preorden(nab.der);
        }
    }

    /**
     * En este caso se trata primero el subárbol izquierdo, después el derecho y por
     * último el nodo actual.
     *
     * Otra forma para entender el recorrido con este método seria seguir el orden:
     * nodo izquierda, nodo derecha, nodo raíz.
     *
     * En el árbol de la figura el recorrido en postorden sería: 2, 5, 11, 6, 7, 4, 9, 5 y 2.
     *
     * @param nab
     */
    public static void postorden(NodoABinario nab){
        if (nab != null){
            postorden(nab.izq);
            postorden(nab.der);
            System.out.print(nab.toString()+" ");
        }
    }

    /**
     * En este caso se trata primero el subárbol izquierdo, después el nodo actual
     * y por último el subárbol derecho. En un ABB este recorrido daría los valores
     * de clave ordenados de menor a mayor.
     *
     * Otra forma para entender el recorrido con este método seria seguir el orden:
     * nodo izquierda, nodo raíz, nodo derecha.
     *
     * En el árbol de la figura el recorrido en inorden sería: 2, 7, 5, 6, 11, 2, 5, 4, 9.
     * @param nab
     */
    public static void inorden(NodoABinario nab){
        if (nab != null){
            inorden(nab.izq);
            System.out.print(nab.toString()+" ");
            inorden(nab.der);
        }
    }
}
