package com.iumafis.project1.point1;

import java.util.Scanner;

public class Point1 {

    private static Scanner screen;
    
    public static void result(){
        
        screen = new Scanner(System.in);
        int age;
        
        System.out.println(String.format("Ingrese su edad"));
        age = screen.nextInt();
        
        String message = (age >= 18) ? "\nPuedes Votar!" : "\nPa la casa pelao";
        
        System.out.println(message);
    }   
}