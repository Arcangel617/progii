package com.company;

/**
 * Realizar un procedimiento que imprima de manera recursiva la tabla del 9.
 * @author Artigue Arcangel Andres
 * @version 030916
 */
public class Ejercicio02 {
    public static void main(String [] args){
        showTable(1,9);

    }

    public static void showTable(int n, int number){
        if (n == 10){
            System.out.print(n*number);
        } else {
            System.out.print(n*number + " ");
            showTable(n+1,number);
        }
    }
}
