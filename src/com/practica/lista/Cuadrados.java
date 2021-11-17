package com.practica.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cuadrados {
    private int n;
    List<Integer> lista=new ArrayList<>();
    List<Integer> lista2=new ArrayList<>();
    public void cuadrados(){
        Random rnd=new Random();
        for (int i = 0; i < n; i++){
            int numero = (int) (Math.random()*n+1);
            int resultado = (int) (Math.pow(numero,2)); // para hacer cuadrado un numero
            lista.add(numero); // lista a imprimir para verificar los cuadrado en lista
            lista2.add(resultado);
        }
        System.out.println(lista);
        System.out.println(lista2);
        System.out.println("");
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }
}
