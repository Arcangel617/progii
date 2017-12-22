package com.company;

public class Example {
    public static void main(String [] args){
        ArbolBinario ab = new ArbolBinario();
        ab.insertar("18");
        ab.insertar("12");
        ab.insertar("28");
        ab.insertar("5");
        ab.insertar("9");
        ab.insertar("20");
        ab.insertar("35");

        System.out.println(ab.getRaiz().izq.izq.izq.info);

        ab.imprimirPre();
        ab.imprimirEntre();
        ab.imprimirPost();
    }
}
