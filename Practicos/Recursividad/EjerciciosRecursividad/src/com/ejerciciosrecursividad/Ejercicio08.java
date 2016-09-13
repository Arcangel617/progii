package com.ejerciciosrecursividad;

/**
 * Given n of 1 or more, return the factorial of n, which is n * (n­1) * (n­2) ... 1. Compute the result
 * recursively (without loops).
 * @author Artigue Arcangel Andres
 * @version 110916
 */
public class Ejercicio08 {
    public static void main (String [] args) {

        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(5));
        System.out.println(factorial(4));
        System.out.println(factorial(6));

    }

    public static int factorial(int n){
        if (n < 2) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
