package com.company;

/**
 * Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n
 * power, so powerN(3, 2) is 9 (3 squared).
 * @author Artigue Arcangel Andres
 * @version 130916
 */
public class Ejercicio10 {
    public static void main (String [] args){
        System.out.println(powerN(2,0));
        System.out.println(powerN(2,2));
        System.out.println(powerN(2,3));
        System.out.println(powerN(2,4));
        System.out.println(powerN(2,5));
        System.out.println(powerN(2,6));
    }

    /**
     * @param b base
     * @param e exponente
     * */
    public static int powerN(int b, int e){
        if (e == 0) {
            return 1;
        } else {
            return b * powerN(b,e-1);
        }
    }
}
