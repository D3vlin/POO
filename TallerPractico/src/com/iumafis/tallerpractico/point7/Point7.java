package com.iumafis.tallerpractico.point7;

import java.util.Scanner;

public class Point7 {
    
    private static Scanner stringIn;
    
    public static void result(){
        
        stringIn = new Scanner(System.in);
        String surname1;
        String surname2;
        String message;
        
        System.out.println(String.format("Ingrese el primer apellido"));
        surname1 = stringIn.nextLine();
        
        System.out.println(String.format("\nIngrese el segundo apellido"));
        surname2 = stringIn.nextLine();
        
        message = (surname1.equals(surname2)) ? "Los dos apellidos son iguales" : "Los dos apellidos son diferentes"; 
        
        System.out.println(String.format("\n" + message));       
    }
}
