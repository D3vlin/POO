package com.iumafis.tallerpractico.point2;

import java.util.Scanner;

public class Point2 {
    
    private static Scanner floatIn;
    private static Scanner stringIn;
    
    public static void result(){
        
        floatIn = new Scanner(System.in);
        stringIn = new Scanner(System.in);
        float totalSales = 0;
        boolean repeat = true;
        
        while (repeat) {
            
            System.out.println(String.format("Por favor ingrese sus ventas de hoy"));
            totalSales += floatIn.nextFloat();

            String optionMenu;
            System.out.println(String.format("Ingresar otra venta?\n\nSi = S\nNo = N"));
            optionMenu = stringIn.nextLine();

            switch(optionMenu) {

                case "S":                
                    repeat = true;
                  break;

                case "N":
                    repeat = false;
                  break;

                default:
                    repeat = false;
                    System.out.println("Error eso no estaba programado");
            }
        }
        
        System.out.println(String.format("\nEl total de ventas del día fue:\n$%s", totalSales));
    }
}
