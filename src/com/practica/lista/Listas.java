package com.practica.lista;

import java.util.*;
import java.util.stream.Collectors;

public class Listas{
    private int cantidad;
    List<Integer> lista=new ArrayList<>();
    List<Integer> lista2=new ArrayList<>();

    public void listaNumeros(){ //numeros aleatorios 4 cifras
        int [] numeros = new int[cantidad];
        int suma=0;
        for (int i=0; i<numeros.length;i++){
            int num = (int) (Math.random()*8999+1000);
            lista.add(num);
            //lista.add((int) (Math.random()*8999+1000));
            //System.out.println(""+lista);
            numeros[i]=num;
        }
        System.out.println(""+lista);

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
            int numero = (int) (Math.random()*99+1);
            lista2.add(numero);
        }
        System.out.println(lista2);
        System.out.println("");

        Set<Integer> items=new HashSet<>();
        System.out.println("Numeros repetidos");
        lista2.stream().filter(n -> !items.add(n)).collect(Collectors.toSet()).forEach(System.out::println);
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
