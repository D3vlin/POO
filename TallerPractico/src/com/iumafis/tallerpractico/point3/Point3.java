package com.iumafis.tallerpractico.point3;

import java.util.Scanner;

public class Point3 {
    
    private static Scanner floatIn;
    
    public static void result(){
        
        floatIn = new Scanner(System.in);
        float expenses = 0;
        
        System.out.println(String.format("Ingrese el valor del gasto del lunes"));
        expenses += floatIn.nextFloat();
        
        System.out.println(String.format("Ingrese el valor del gasto del martes"));
        expenses += floatIn.nextFloat();
        
        System.out.println(String.format("Ingrese el valor del gasto del miercoles"));
        expenses += floatIn.nextFloat();
        
        System.out.println(String.format("Ingrese el valor del gasto del jueves"));
        expenses += floatIn.nextFloat();
        
        System.out.println(String.format("Ingrese el valor del gasto del viernes"));
        expenses += floatIn.nextFloat();
        
        System.out.println(String.format("\nEl valor de total de los gastos en la semana fue $%s", expenses));        
    }
}
