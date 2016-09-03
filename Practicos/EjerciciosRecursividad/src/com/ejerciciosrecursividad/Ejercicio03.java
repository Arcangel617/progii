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

    public static void findHighest(int[] a, int position, int mayor){
        if (position == 0){
            if (a[position] > mayor){
                System.out.println(a[position]);
            } else {
                System.out.println(mayor);
            }
        } else {
            if(a[position] > mayor){
                mayor = a[position];
                findHighest(a,position-1,mayor);
            } else {
                findHighest(a,position-1,mayor);
            }
        }
    }
}
