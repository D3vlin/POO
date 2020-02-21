package com.iumafis.tallerpractico.point4;

import java.util.Arrays;
import java.util.Scanner;

public class Point4 {
    
    private static Scanner intIn;
    
    public static void result(){
        
        intIn = new Scanner(System.in);
        int[] students = new int[15];
        
        for (int i = 0; i < students.length; i++) {
            
            System.out.println(String.format("\nIngrese la edad del estudiante #%s", (i + 1)));
            students[i] = intIn.nextInt();
        }
        Arrays.sort(students);
        
        System.out.println(String.format("\nEdades de los alumnos en orden\n"));        
        for (int i = 0; i < students.length; i++) {
            
            System.out.println(String.format("Alumno #%s: edad => %s", (i + 1), students[i]));
        }        
    }
}
