package com.ejerciciosrecursividad;

/**
 * Realizar un procedimiento que encuentre el número mayor de un vector de n números enteros de
 * manera recursiva.
 * @author Artigue Arcangel Andres
 * @version 030916
 */

public class Ejercicio03 {
    public static void main(String [] args){

        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int)Math.floor(Math.random()*100);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\nMayor: ");

        findHighest(a,a.length-1,Integer.MIN_VALUE);
    }

    /**
     * Busca el mayor numero entero en un arreglo de enteros que se
     * pasa como parámetro.
     * @param a Un arreglo de numeros enteros.
     * @param n la longitud del arreglo.
     * @param mayor un valor de referencia para realizar las comparaciones en la búsqueda.
     * @return void
     * */
    public static void findHighest(int[] a, int n, int mayor){
        if (n == 0){
            if (a[n] > mayor){
                System.out.println(a[n]);
            } else {
                System.out.println(mayor);
            }
        } else {
            if(a[n] > mayor){
                mayor = a[n];
                findHighest(a,n-1,mayor);
            } else {
                findHighest(a,n-1,mayor);
            }
        }
    }
}
