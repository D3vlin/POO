package com.iumafis.tallerpractico.point1;

import java.util.Scanner;

public class Point1 {
    
    private static Scanner floatIn;
    
    public static void result(){
        
        floatIn = new Scanner(System.in);
        float valueService;
        
        System.out.println(String.format("Ingrese el valor del servicio"));
        valueService = floatIn.nextFloat();
        
        System.out.println(String.format("\nEl valor del servicio es $%s\nEl valor del iva es $%s\nEl valor total es $%s",
                                         valueService,
                                         (valueService * 0.19),
                                         valueService + (valueService * 0.19)
        ));        
    }
}
