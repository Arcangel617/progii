package com.company;

class Nodo
{
    String info;
    Nodo izq, der;
}

class ArbolBinario {
    Nodo raiz;

    public ArbolBinario()
    {
        raiz=null;
    }

    public void insertar (String info)
    {
        Nodo nuevo;
        nuevo = new Nodo ();
        nuevo.info = info;
        nuevo.izq = null;
        nuevo.der = null;
        if (raiz == null)
            raiz = nuevo;
        else
        {
            Nodo anterior = null, reco;
            reco = raiz;
            while (reco != null)
            {
                anterior = reco;
                if (info.compareToIgnoreCase(reco.info) < 0)
                    reco = reco.izq;
                else
                    reco = reco.der;
            }
            if (info.compareToIgnoreCase(anterior.info) < 0)
                anterior.izq = nuevo;
            else
                anterior.der = nuevo;
        }
    }

    public Nodo getRaiz(){
        return raiz;
    }


    private void imprimirPre (Nodo reco)
    {
        if (reco != null)
        {
            System.out.print(reco.info + " ");
            imprimirPre (reco.izq);
            imprimirPre (reco.der);
        }
    }

    public void imprimirPre ()
    {
        imprimirPre (raiz);
        System.out.println();
    }

    private void imprimirEntre (Nodo reco)
    {
        if (reco != null)
        {
            imprimirEntre (reco.izq);
            System.out.print(reco.info + " ");
            imprimirEntre (reco.der);
        }
    }

    public void imprimirEntre ()
    {
        imprimirEntre (raiz);
        System.out.println();
    }


    private void imprimirPost (Nodo reco)
    {
        if (reco != null)
        {
            imprimirPost (reco.izq);
            imprimirPost (reco.der);
            System.out.print(reco.info + " ");
        }
    }


    public void imprimirPost ()
    {
        imprimirPost (raiz);
        System.out.println();
    }


}
