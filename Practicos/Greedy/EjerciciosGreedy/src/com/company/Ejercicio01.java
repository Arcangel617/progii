package com.company;
/**
 * Escriba un algoritmo que permita el ingreso de un número entero de monedas, donde (1 < n <= 10)
 * y luego solicite los valores de dichas monedas. Finalmente, el programa debe solicitar un monto
 * decimal a pagar. El algoritmo debe mostrar el listado de las monedas usadas para pagar el monto 
 * usando siempre en primer lugar las monedas de mayor denominación.
 * 
 * @author Arcangel Andres Artigue
 * @version 300916
 */

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nroMonedas;

        System.out.println("<< Numero de monedas a ingresar (1 < n <= 10) >>");
        do {
            System.out.print(">> ");
            nroMonedas = s.nextInt();
        } while (nroMonedas < 1 || nroMonedas > 10);

        int[] monedas = new int[nroMonedas];

        System.out.println("Ingrese los valores para las "+ nroMonedas +" monedas: ");
        for (int i = 0; i < nroMonedas; i++) {
            System.out.print("["+(i+1)+"]: ");
            monedas[i] = s.nextInt();
        }

        for (int m : monedas
                ) {
            System.out.print(m + " ");

        }
        System.out.println();

        monedas = ordenar(monedas);

        for (int m : monedas
                ) {
            System.out.print(m + " ");

        }
        System.out.println();

        System.out.print("Monto a pagar: ");
        int monto = s.nextInt();
        int cantMonedas;

        for (int i = 0; i < monedas.length; i++) {

            if(monedas[i] <= monto){
                cantMonedas = monto / monedas[i];
                System.out.println(cantMonedas + " $" +monedas[i]);
                monto -= cantMonedas*monedas[i];
            }
        }

    }

    public static int[] ordenar(int[] a){
        int buffer;
        int i,j;
        for (i = 0; i < a.length; i++){
            for (j = 0; j < i; j++){
                if (a[i] > a[j]){
                    buffer = a[j];
                    a[j] = a[i];
                    a[i] = buffer;
                }
            }
        }
        return a;
    }
}
