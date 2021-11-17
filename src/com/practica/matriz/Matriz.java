package com.practica.matriz;

import java.util.Random;

public class Matriz {
    private int fila;
    private int columna;
    private int numAleatorio;

    public void matriz(){
        int[][] matriz = new int[fila][columna];
        Random r = new Random();

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = r.nextInt(numAleatorio);
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }



    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getNumAleatorio() {
        return numAleatorio;
    }

    public void setNumAleatorio(int numAleatorio) {
        this.numAleatorio = numAleatorio;
    }
}
