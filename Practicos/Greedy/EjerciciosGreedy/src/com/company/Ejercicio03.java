package com.company;

import java.util.Scanner;

/**
 * http://codeforces.com/problemset/problem/701/A
 * @author Arcangel Andres Artigue
 * @version 300916
 */
public class Ejercicio03 {

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        int sumaValores = 0;

        int n = s.nextInt();
        
        int[] cartas = new int[n];

        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = s.nextInt();
        }

        for (int i = 0; i < cartas.length; i++) {
            sumaValores = sumaValores + cartas[i];
        }

        if (sumaValores % (cartas.length/2) == 0){
            int sumaCartas = sumaValores / (cartas.length/2);
            for (int i = 0; i < cartas.length; i++) {
                for (int j = 0; j < cartas.length; j++) {
                    if (cartas[i]+cartas[j] == sumaCartas && i != j){
                        System.out.println((i+1) + " " + (j+1));
                        cartas[i] = 0;
                        cartas[j] = 0;
                    }
                }
            }
        }
    }
}
