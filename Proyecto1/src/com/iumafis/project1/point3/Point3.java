package com.iumafis.project1.point3;

import java.util.Scanner;

public class Point3 {
    
    private static Scanner screen;
    
    public static void result(){
        
        screen = new Scanner(System.in);
        int n;
        
        System.out.println(String.format("Ingrese el valor"));
        n = screen.nextInt();
        
        for(int i = 0; i <= 10; i++) {
            System.out.println(String.format("\n%s X %s = %s", n, i, (n * i)));
        }
    }    
}
