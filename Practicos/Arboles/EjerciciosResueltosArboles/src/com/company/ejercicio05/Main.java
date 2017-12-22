package com.company.ejercicio05;

import java.util.Scanner;

/**
 * Created by arcangel on 11/11/16.
 */
public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        System.out.println("String 1: ");
        String s1 = s.next();
        System.out.println("String 2: ");
        String s2 = s.next();

        if (s1.compareToIgnoreCase(s2) == 0){
            System.out.println("Son iguales");
        } else if (s1.compareToIgnoreCase(s2) < 0) {
            System.out.println(s2 + " va primero");
        } else {
            System.out.println(s1 + " va despues.");
        }
    }
}
