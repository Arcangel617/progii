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

        monedas = ordenar(monedas);

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
        int aux;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i+1] > a[i]){
                aux = a[i];
                a[i] = a[i+1];
                a[i+1] = aux;
            }
        }
        return a;
    }
}
