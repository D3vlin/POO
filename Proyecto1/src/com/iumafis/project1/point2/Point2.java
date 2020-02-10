package com.iumafis.project1.point2;

import java.util.Scanner;

public class Point2 {
    
    private static Scanner screen;
    
    public static void result(){
        
        screen = new Scanner(System.in);
        int a;
        int b;
        int c;
        
        System.out.println(String.format("Ingrese el valor 1"));
        a = screen.nextInt();
        
        do {
            System.out.println(String.format("\nIngrese el valor 2"));
            b = screen.nextInt();
            
            if(a == b) {
                System.out.println("Debe ingresar un valor diferente al valor 1");
            }            
        } while (a == b);
        
        do {
            System.out.println(String.format("\nIngrese el valor 3"));
            c = screen.nextInt();
            
            if(a == c || b == c) {
                System.out.println("Debe ingresar un valor diferente al valor 1 y valor 2");
            }
            
        } while (a == c || b == c);
        
        if(a > b && a > c) {
            System.out.println(String.format("El valor 1 es mayor: %s", a));
        
        } else if(b > c) {
            System.out.println(String.format("El valor 2 es mayor: %s", b));
        
        } else {
            System.out.println(String.format("El valor 3 es mayor: %s", c));
        }
    }
}
