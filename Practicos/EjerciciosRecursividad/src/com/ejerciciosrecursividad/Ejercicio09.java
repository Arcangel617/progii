package com.ejerciciosrecursividad;

/**
 * Given a non­negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10
 * yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 */
public class Ejercicio09 {
    public static void main (String [] args){
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(456));
        System.out.println(sumDigits(789));
        System.out.println(sumDigits(101));
        System.out.println(sumDigits(112));
        System.out.println(sumDigits(100));
    }

    public static int sumDigits(int n){
        if (n == 0){
            return 0;
        } else if (n % 10 > 0){
            return (n % 10) + sumDigits(n / 10);
        } else {
            return sumDigits(n / 10);
        }
    }
//    public static void sumDigits(int n){
//        System.out.println(n % 10);
//        System.out.println(n / 10);
//    }
}
