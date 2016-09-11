package com.ejerciciosrecursividad;

/**
 * We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total
 * number of ears across all the bunnies recursively (without loops or multiplication).
 * @author Artigue Arcangel Andres
 * @version 030916
 */
public class Ejercicio05 {
    public static void main(String [] args){
        System.out.println(bunnyEars(0));
        System.out.println(bunnyEars(1));
        System.out.println(bunnyEars(2));
        System.out.println(bunnyEars(3));

    }

    public static int bunnyEars(int n){
        if (n == 0) {
            return 0;
        } else {
            return bunnyEars(n-1) + 2;
        }
    }
}
