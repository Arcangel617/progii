package com.company;

/**
 * Realizar un procedimiento que imprima de manera recursiva los números del 1 al 10.
 * @author Artigue Arcangel Andres
 * @version 030916
 */
public class Ejercicio01 {
    public static void main (String [] args){
        countTo10(1);
    }

    public static void countTo10(int n){
        if (n == 10){
            System.out.print(n);
        } else {
            System.out.print(n + " ");
            countTo10(n+1);
        }
    }
}
