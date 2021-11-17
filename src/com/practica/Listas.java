package com.practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listas{
    private int cantidad;
    List<Integer> lista=new ArrayList<>();

    public void listaNumeros(){
        int [] numeros = new int[cantidad];
        int suma=0;
        for (int i=0; i<numeros.length;i++){
            int lista = (int) (Math.random()*8999+1000);
            //lista.add((int) (Math.random()*8999+1000));
            System.out.println(""+lista);
            numeros[i]=lista;
        }
        //System.out.println(""+lista);
        for (int i=0; i< numeros.length;i++){
            suma+=numeros[i];
        }
        System.out.println("Sumatoria: "+suma);
        System.out.println("");
    }

//-------------------------------------------------------------------

    public void numerosAl(){ //numeros aleatorios 1 - 100
        Random rnd=new Random();
        for (int i = 0; i < 50; i++){
            lista.add((int) (Math.random()*99+1));
        }
        System.out.println(lista);
        System.out.println("");
    }



//----------------------------------------------------------------------
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
