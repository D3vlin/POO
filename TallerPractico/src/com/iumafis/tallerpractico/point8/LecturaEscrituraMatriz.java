package com.iumafis.tallerpractico.point8;

import java.util.*;   // Paquete de utilidades
import javax.swing.*; // Paquete para crear formularios

public class LecturaEscrituraMatriz {
    
    public static void main(String[] args) {
        
        int filas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite las Filas:"));       // Solicita las filas
        int columnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite las columnas:")); // Solicita las columnas
        int i, j; // Indices de la matriz
        
        Random R = new Random();             // Para generar una secuencia de números pseudoaleatorios.
        int A[][]= new int[filas][columnas]; // Inicializa la matriz con los valores ingresados
        
        //Lectura()
        // Recorre la matriz y guarda el valor absoluto de un numero aleatorio
        for(i = 0; i < filas; i++) {
            for(j = 0; j < columnas; j++) {
                A[i][j] = Math.abs(R.nextInt() % 99 + 1);
            }
        }
            
        //Escritura
        // Imprime la matriz generada
        System.out.println("------ Matriz Leida -------");
        for(i = 0; i < filas; i++) {
            System.out.println();
            for(j = 0;j < columnas; j++) {
                if(A[i][j] >= 10)
                    System.out.print(A[i][j] + " ");
                else
                    System.out.print(A[i][j] + " ");
            }
        }
        System.out.println();

        System.exit(0);
    }
}