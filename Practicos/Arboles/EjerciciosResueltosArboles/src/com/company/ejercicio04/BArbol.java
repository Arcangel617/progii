package com.company.ejercicio04;

public class BArbol {

    private NodoArbol primero; // define un nodo arbol inicial

    /**
     * Constructor de la clase
     * @param primero NodoArbol
     */
    public BArbol(NodoArbol primero) {
        this.primero = primero;
    }

    public boolean esHoja(){
        return ((this.primero.izq == null) && (this.primero.der == null));
    }

    public boolean estaEn(NodoArbol nodo, int valor){
        if (this.primero == null){
            return false;
        } else if (nodo.valor == valor){
            return true;
        } else if (valor < nodo.valor){
            return estaEn(nodo.izq, valor);
        } else {
            return estaEn(nodo.der, valor);
        }
    }

    @Override
    public String toString() {
        return this.primero.toString();
    }
}
