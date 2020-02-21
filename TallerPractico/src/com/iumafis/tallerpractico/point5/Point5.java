package com.iumafis.tallerpractico.point5;

import java.util.Scanner;

public class Point5 {
    
    private static Scanner intIn;
    
    public static void result(){
        
        intIn = new Scanner(System.in);
        int degrees;
        boolean found = false;
        
        for (int i = 1; i <= 28; i++) {
            degrees = (int) (Math.random() * 50);
            
            if (degrees >= 45) {
                System.out.println(String.format("El %s de febrero la temperatura fue de %s grados", i, degrees));
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No hubo días en febrero que tuviesen 45 grados");
        }       
    }
}
