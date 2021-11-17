package com.practica;

public class Main {
    public static void main(String[] arg){

        Listas lista = new Listas();

        Matriz matriz=new Matriz();

        lista.setCantidad(10); // cantidad de elemtos al azar
        lista.listaNumeros(); // numeros 4 cifras
        lista.numerosAl(); // numeros 1-100

        matriz.setColumna(5);
        matriz.setFila(5);
        matriz.setNumAleatorio(100);
        matriz.matriz();

        System.out.println(lista);
        System.out.println(matriz);

    }
}
