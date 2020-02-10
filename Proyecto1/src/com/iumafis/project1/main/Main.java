package com.iumafis.project1.main;

import java.util.Scanner;
import com.iumafis.project1.point1.Point1;
import com.iumafis.project1.point2.Point2;
import com.iumafis.project1.point3.Point3;
import com.iumafis.project1.point4.Point4;

public class Main {
    
    private static Scanner screen;
    
    public static void main(String[] args) {
        
        screen = new Scanner(System.in);
        int option;
        
        System.out.println(String.format("Que punto ejecutar?\n"));
        option = screen.nextInt();
        System.out.println("");
        
        switch(option) {
            
            case 1:                
              Point1.result();
              break;
                
            case 2:
              Point2.result();
              break;
                
            case 3:
              Point3.result();
              break;
                
            case 4:
              Point4.result();
              break;
                
            default:
                System.out.println("Este punto no esta disponible :'c");
        }
    }  
}
