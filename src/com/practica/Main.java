package com.practica;

import com.practica.lista.Cuadrados;
import com.practica.lista.Listas;
import com.practica.matriz.Matriz;

public class Main {
    public static void main(String[] arg){

        Listas lista = new Listas();

        Matriz matriz=new Matriz();

        Cuadrados c2=new Cuadrados();

        lista.setCantidad(10); // cantidad de elemtos al azar
        lista.listaNumeros(); // numeros 4 cifras
        lista.numerosAl(); // numeros 1-100

        matriz.setColumna(5);
        matriz.setFila(5);
        matriz.setNumAleatorio(100);
        matriz.matriz();

        c2.setN(10); // limite numeros cuadrados
        c2.cuadrados();

        System.out.println(lista);
        System.out.println(matriz);
        System.out.println(c2);
    }
}
